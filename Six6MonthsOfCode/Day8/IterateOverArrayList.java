package Six6MonthsOfCode.Day8;
import java.util.*;
public class IterateOverArrayList{
    public static void main(String[] args) {
        ArrayList<String> tvShows = new ArrayList<String>();
        tvShows.add("Nimki Mukhiya");
        tvShows.add("Game of Thrones");
        tvShows.add("Mahabharat");
        tvShows.add("Balika Badhu");

        System.out.println("Traversing using forEach() and Lamda expressions\n");
        tvShows.forEach(tvShow ->{System.out.println(tvShows);});
        // tvShows.(tvShow ->{System.out.println(tvShows);}; ERROR : 

        System.out.println("\n === Iterate using an Iterator");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n === Traversing using iterator() and forEachRemaining()");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });
    }

    // System.out.println(" \n === Traversing using a ListIterator() \n ");
    // Here, we start from the end of the lsit and traaverse backwards.
    ListIterator<String> tvShowListIterator = tvShows.ListIterator(tvShows.size());
    while(tvShowListIterator.hasPrevious()){
        String tvShow = tvShowListIterator.previous();
        System.out.println(tvShow);
    }

    // System.out.println("\n === Iterate using simple for-each loop ===>>");
    for(String tvShow : tvShows){
        System.out.println(tvShow + " ");
    }

    // System.out.println("\n === Iterate using for loop with index ===");
    for(int i = 0; i  < tvShows.size(); i++){
        System.out.println(tvShows.get(i) + " ");
    }
}
/*
 * Six6MonthsOfCode/Day8/IterateOverArrayList.java:29: error: <identifier> expected
    System.out.println("\n === Traversing using a ListIterator() \n");
                      ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:29: error: illegal start of type
    System.out.println("\n === Traversing using a ListIterator() \n");
                       ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: illegal start of type
    while(tvShowListIterator.hasPrevious()){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: <identifier> expected
    while(tvShowListIterator.hasPrevious()){
                                        ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: ';' expected
    while(tvShowListIterator.hasPrevious()){
                                          ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:37: error: <identifier> expected
    System.out.println("\n === Iterate using simple for-each loop ===>>");
                      ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:37: error: illegal start of type
    System.out.println("\n === Iterate using simple for-each loop ===>>");
                       ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: illegal start of type
    for(String tvShow : tvShows){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: ';' expected
    for(String tvShow : tvShows){
                     ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: <identifier> expected
    for(String tvShow : tvShows){
                               ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:42: error: <identifier> expected
    System.out.println("\n === Iterate using for loop with index ===");
                      ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:42: error: illegal start of type
    System.out.println("\n === Iterate using for loop with index ===");
                       ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: illegal start of type
    for(int i = 0; i  < tvShows.size(); i++){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: > expected
    for(int i = 0; i  < tvShows.size(); i++){
                                    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: <identifier> expected
    for(int i = 0; i  < tvShows.size(); i++){
                                         ^
15 errors
@SuhelKhanCA ➜ /workspaces/DS-Algo (main) $ javac Six6MonthsOfCode/Day8/IterateOverArrayList.java 
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: illegal start of type
    while(tvShowListIterator.hasPrevious()){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: <identifier> expected
    while(tvShowListIterator.hasPrevious()){
                                        ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:32: error: ';' expected
    while(tvShowListIterator.hasPrevious()){
                                          ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:37: error: <identifier> expected
    System.out.println("\n === Iterate using simple for-each loop ===>>");
                      ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:37: error: illegal start of type
    System.out.println("\n === Iterate using simple for-each loop ===>>");
                       ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: illegal start of type
    for(String tvShow : tvShows){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: ';' expected
    for(String tvShow : tvShows){
                     ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:38: error: <identifier> expected
    for(String tvShow : tvShows){
                               ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:42: error: <identifier> expected
    System.out.println("\n === Iterate using for loop with index ===");
                      ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:42: error: illegal start of type
    System.out.println("\n === Iterate using for loop with index ===");
                       ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: illegal start of type
    for(int i = 0; i  < tvShows.size(); i++){
    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: > expected
    for(int i = 0; i  < tvShows.size(); i++){
                                    ^
Six6MonthsOfCode/Day8/IterateOverArrayList.java:43: error: <identifier> expected
    for(int i = 0; i  < tvShows.size(); i++){
                                         ^
13 errors
 */