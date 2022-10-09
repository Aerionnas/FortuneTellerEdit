Project Title: Ice Cream Truck Simulator

Description: This program is modeled after the kid's origami fortune teller game
where you choose a color and a number, then you are given a fortune.

Languages used: Java(Object Oriented Programming)

For this project, I used four different files: fortunatrial.java, fortune.java,
Fortunes.csv, and TextIO.java. Please find information about each class below:

fortunatrial.java- This file uses the scanner to read the fortunes.csv file to
get read all the fortunes and put them in a String array of fortunes. It also
contains the giveFortune() method that chooses a random fortune from the array.

fortune.java- this contains the main method that runs the entire program and calls
the necessary methods. It contains several different methods that allow for the user
to choose a color and number.

fortunes.csv- this files contains all of the fortunes used for this program.

TextIO.java- this is just used to get the user input at certain points of the program.

Building this project, I face many challenges. One of the main challenges was
getting the scanner to read the csv file. I took several tries and stack overflow
to figure it out. I even tried to come up with another solution where I create an
array of fortunes and just randomly chose a fortune from there. You can see this
the first commit. This code is now commented out because I was able to finally get
the scanner to read the csv file.

To run this project, compile the fortune.java class and run it in the
terminal.


credits: Aerionna Stephenson
