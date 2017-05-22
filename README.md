## Nancy's Make Change Project

This is my week 1 of Skill Distillery project. My program is a basic Java program that takes input from the user on the terminal and returns the amount of change due. This project incorporates the fundamentals of Java that were covered in the first week, such as conditional statements, casting, and methods. 

In the main class, the change due is cast into the integer bills so that the decimals are dropped and we are looking at whole dollar amounts. Then, cents due is calculated by subtracting change from bills and then rounded and multiplied by 100 to make it easier to handle the calculations. These variables are then passed to the methods giveBills and giveCoins.

In the giveBills class, bills is divided into separate bill denominations and modular arithmetic is used to calculate how much is still owed after returning that particular bill. Conditional statements are used to determine whether a certain bill will be produced given the amount of change due. For example, if the number of bills divided by 10 is greater than or equal to 0, we can pass out a ten dollar bill and the number of bills left is the remainder after being divided by 10. The number of bills is then divided by five for five dollar bills and the remainder is then carried on to the next if statement. So lastly, if the number of bills left is the ones.

The giveCoins class essentially functions the same way as the giveBills class except it must calculate using coin denominations. We first divided the number of coins by 25 to calculate if quarters need to be passed out and then we find the number of dimes, nickels, and pennies.

These two methods are called on in the main class and the system outputs the amount of change due. In the event that the customer provides exact change or not enough money, the code in the methods are never executed.

The most difficult part of this project was casting doubles to integers and making sure that variable types were consistent throughout the program. I found it difficult to pass the variables to the methods with all the datatype conversions. Also, I struggled with calculating the change in different denominations because my math was very complex and messy at first and then I realized how I can transfer variable information from one if statement to the next.
