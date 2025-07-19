package ClassPackage;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean song = true;
        while (song) {
            System.out.println("Enter the day of Christmas, first, second, third and so on and exit to quit: ");
            String day = sc.nextLine().toLowerCase();
            switch (day) {
                case "first" -> {
                    System.out.println("on the first day of Christmas, my true love gave to me, A partridge in a pear tree");
                }
                case "second" -> {
                    System.out.println("On the second day of Christmas, my true love gave to me ,Two turtle doves, And a partridge in a pear tree.");
                }
                case "third" -> {
                    System.out.println("On the third day of Christmas, my true love gave to me Three French hens Two turtle doves,And a partridge in a pear tree.");
                }
                case "fourth" -> {
                    System.out.println("On the fourth day of Christmas, my true love gave to me Four calling birds,Three French hens, Two turtle doves,");
                }
                case "fifth" -> {
                    System.out.println("On the fifth day of Christmas, my true love gave to me Five golden rings, Four calling birds, Three French hens,Two turtle doves And a partridge in a pear tree.");
                }
                case "sixth" -> {
                    System.out.print("On the sixth day of Christmas, my true love gave to me, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "seventh" -> {
                    System.out.println("On the seventh day of Christmas, my true love gave to me, Seven swans a-swimming,Six geese a-laying,Five golden rings,Four calling birds,Three French hens,Two turtle doves, And a partridge in a pear tree.");
                }
                case "eighth" -> {
                    System.out.println("On the eighth day of Christmas, my true love sent to me, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "ninth" -> {
                    System.out.println("On the ninth day of Christmas, my true love sent to me, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "tenth" -> {
                    System.out.println("On the tenth day of Christmas, my true love sent to me, Ten lords a-leaping, Nine ladies dancing,Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "eleventh" -> {
                    System.out.println("On the eleventh day of Christmas, my true love sent to me, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing,Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "twelfth" -> {
                    System.out.println("On the twelft day of Christmas, my true love sent to me, Twelve drummers drumming,Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing,Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree.");
                }
                case "exit" -> {
                    System.out.println("Goodbye!");
                    song = false;
                }
                default -> {
                    System.out.print("Invalid day, please try again: ");
                }

            }

        }
    }
}


