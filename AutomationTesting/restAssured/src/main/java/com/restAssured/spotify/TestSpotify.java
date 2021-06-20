package com.restAssured.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.response.Response;

public class TestSpotify {

	String arg = "application/json";
	String token;
	String userId;
	int noOfPlaylist;
	String[] playlists;
	int noOfTrack;
	String []tracksName;
	String []tracksUri;

	@BeforeMethod
	public void setup() {
		// for give the authorization
		token = "Bearer BQBHKCFnqQ_kGs5Qp3_wpjlgwliN7TLPgynDjnVMjcq66J7IhO84c6pidnwJqkBl3rGQLxkAZzgPLlD4SrLMgPHJhyPDonB3jBWwdKma8a1_g6F27LwAiykHyDU-2DbpyxBVO6kSI5t0aIvir0WI_sLjOIDfLitcYUOiraVeNLZbBT_ANBtl_HXj9uoslvpgYjZ-P9fyjffQtW1DLv3rUE5aj6Jg6pVPR2s31FoIQBprT6gerrWXRzhb2zcbd1h4u6S5n61IjFGpMGIutMSORay3GeXXDQ";
	}

	// function to test get the user details profile  
	@Test(priority=1)
	public void token_getUserId() {
		Response response = given()
				.header("Accept", arg)
				.header("Content-Type", arg)
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/me")
				.then()
				.extract()
				.response();

		userId = response.path("id");
		System.out.println("User id for the login is " + userId);
		// response.prettyPrint();
	}

	// function for test get the user profile details api
	@Test(priority=2)
	public void userId_GetUserProfile() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/" + userId + "/");
		
		// get body 
		String body = response.getBody().asString();
		
		JsonObject object = (JsonObject) new JsonParser().parse(body);
		// get the type of account
		String type = String.valueOf(object.get("type"));
		System.out.println("type of account " + type);
		// response.prettyPrint();
	}

	// function for test get all the Playlist api
	@Test(priority=3)
	public void userId_GetAllPlaylist() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/" + userId + "/playlists");
		noOfPlaylist = response.path("total");
		playlists = new String[noOfPlaylist];
		for (int i = 0; i < playlists.length; i++) {
			playlists[i] = response.path("items[" + i + "].id");
		}
		System.out.println("Total playlist : " + noOfPlaylist);
		for (String id : playlists) {
			System.out.print(id + " , ");
		}
		System.out.println();
	}

	// function for test the create playlist api
	@Test(priority=4)
	public void userId_CreatPlaylist() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization", token)
				.body("{\"name\": \"New Playlist\",\"description\": \"New playlist description\",\"public\": false}")
				.when()
				.post(" https://api.spotify.com/v1/users/" + userId + "/playlists");
		userId_GetAllPlaylist();
	}

	// function for test the update(change) playlist details api
	@Test(priority=5)
	public void playlistId_ChangePlaylistDetails() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization",token)
				.body("{\"name\": \"Updated Playlist Name\",\"description\": \"Updated playlist description\",\"public\": false}")
				.when()
				.put("https://api.spotify.com/v1/playlists/"+playlists[0]);
		response.prettyPrint();
	}
	
	// function for test get all tracks api
	@Test(priority=6)
	public void playlistId_GetAllTracks() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization", token)
				.when().accept(arg)
				.get("https://api.spotify.com/v1/playlists/"+ playlists[1]+"/tracks");
		//response.prettyPrint();
		int noOfTrack= response.path("total");
		System.out.println("total number of track ==> " + noOfTrack);
		tracksName = new String[noOfTrack];
		tracksUri = new String[noOfTrack];
		System.out.println("Name of the tracks");
		for (int i = 0; i < tracksName.length; i++) {
			tracksName[i]=response.path("items["+i+"].track.name");
			tracksUri[i]=response.path("items["+i+"].track.uri");
			String track_Details= tracksName[i]+" === "+tracksUri[i];
			System.out.println("\t\t"+track_Details);
		}
	}
	
	// function to test delete track api
	@Test(priority=7)
	public void playlistId_DeleteTrack() {
		int i=1;
		System.out.println("track uri of "+i+" == "+tracksUri[i]);
		Response response=given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization",token)
				.body("{\"tracks\": [{\"uri\":\""+tracksUri[i]+"\",\"positions\":["+i+"]}]}")
				.when()
			.delete("https://api.spotify.com/v1/playlists/"+ playlists[1] +"/tracks");
		response.prettyPrint();
	}
	
	// function to test add track api
	@Test(priority=8)
	public void playlistId_AddTrack() {
		Response response = given()
				.accept(arg)
				.contentType(arg)
				.header("Authorization",token)
				.body("{\"uris\": [\""+tracksUri[1]+"\"]}")
				.when()
				.post("https://api.spotify.com/v1/playlists/"+playlists[0] +"/tracks/");
		response.prettyPrint();
	}
}
