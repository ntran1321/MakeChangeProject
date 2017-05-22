## Make Change Project (Week 1)

My program is a basic Java program that takes input from the user on the terminal and returns the amount of change due. This project incorporates the fundamentals of Java that were covered in the first week, such as conditional statements, casting, and methods. 

In the main class, the change due is cast into the integer bills so that the decimals are dropped and we are looking at whole dollar amounts. Then, cents due is calculated by subtracting change from bills and then rounded and multiplied by 100 to make it easier to handle the calculations. These variables are then passed to the methods giveBills and giveCoins.

The two methods giveCoins and giveBills are called in the main class and output the amount of change due. In the event that the customer provides exact change or not enough money, the code in the methods are never executed.The number of bills and coins to return simply implement modular arithmetic to find the whole number of change to provide.

The most difficult part of this project was casting doubles to integers and making sure that variable types were consistent throughout the program. I found it difficult to pass the variables to the methods with all the datatype conversions. Also, I struggled with calculating the change in different denominations because my math was very complex and messy at first and then I realized how I can transfer variable information from one if statement to the next.
