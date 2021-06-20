package com.scorpin.problems.countEachBird;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

/**
 * Purpose :
 * 
 * You have been asked to help study the population of birds migrating across
 * the continent. Each type of bird you are interested in will be identified by
 * an integer value. Each time a particular kind of bird is spotted, its id
 * number will be added to your array of sightings. You would like to be able to
 * find out which type of bird is most common given a list of sightings. Your
 * task is to print the type number of that bird and if two or more types of
 * birds are equally common, choose the type with the smallest ID number.
 * 
 * For example, assume your bird sightings are of types arr=[1,1,2,2,3]. There
 * are two each of types 1 and 2, and one sighting of type 3. Pick the lower of
 * the two types seen twice : type 1.
 * 
 * @author Nikunj Balar
 *
 */
public class CountEachBird {
	static int migratoryBirds(List<Integer> arr) {
		int birds[] = {0,0,0,0,0};
		int bird=0;
		int max=birds[0];
		for (int i : arr) {
			birds[i-1] += 1;
		}
		for (int i = 0;i< birds.length;i++) {
			if (max < birds[i]) {
				max = birds[i];
				bird=i+1;
			}
		}
		return bird;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedReader.close();
    }
	
}