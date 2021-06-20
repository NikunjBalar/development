package com.apiTesting.spotisy;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TestSpotifyApi {

	@Test
	public void testPlaylist() {
		Response response =get("https://open.spotify.com/playlist/2J5J7isemLK4qFzTkpdnKT");

		int code = response.getStatusCode();
		System.out.println("Status code of the request " + code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testTreakOfPlaylist() {
		double time=get("https://developer.spotify.com/console/get-playlist-tracks/").getTime();
		System.out.println("Time for processing the request "+time);
	}
	
	@Test
	public void testCurruntUserPlaylist() {
		String data=get("https://developer.spotify.com/console/get-current-user-playlists/").asString();
		System.out.println("Data of the request"+data);
	}
	
	@Test 
	public void testHomePage() {
		Headers header=get("https://open.spotify.com/").getHeaders();
		System.out.println("Header of the request "+header);
	}

	
	@Test
	public void testUserPlaylist() {
		String getUserId ="gzjqlb1cecurzzvgq47o7djcf";
		String userPlaylistList=get("https://open.spotify.com/playlist/").asString();
		System.out.println(userPlaylistList);
		System.out.println("the user id is " + getUserId);
	}
}
