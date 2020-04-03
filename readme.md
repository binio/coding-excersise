# Cardano Software Engineer Coding Test
## Java
This is a skeleton Java / Gradle version of the test
## Test
### Java Program
1. Create a function that accepts an array of numbers and returns a reversed array (e.g. [1,2,3] would be [3,2,1]

2.	Write a function that transforms an array of strings to an upper-case array of strings

3.	Given a sentence create a function that returns the number of unique words (e.g. 'the cat jumped over the mat' would be [{'the': 2}, {'cat': 1}…]

4.	Write a function 'composeu' that takes two unary functions and returns a unary function that calls them both. A unary function has a single argument and a single return value (e.g. f(d) { return d + 1}

5.	Write a function that reads from a file and prints the contents to the console

6.	Give an example of how a function would handle an invalid argument 
### SQL
Any SQL dialect will suffice

1.	Create a query to return the unique rows in a table
SELECT DISTINCT(column_name) FROM table_name WHERE column_name (conditions)

2.	Write a command to insert values into a table
INSERT INTO table_name (col_1, col_2) values (1,2))
INSERT INTO table_name (col_1, col_2) values (1,3))
INSERT INTO table_name (col_1, col_2) values (2,2))

3.	Create a query that joins two tables together. Note, all rows from the first table must be in the result-set (e.g. given customer and order tables, return all customers and any orders for each customer)
SELECT c.col_name1, c.col_name2, s.some_col1 FROM customer c LEFT JOIN order s ON c.CustomerId = s.CustomerId;

Eg. Customer table
CustomerId , Name
1          | Thomas
2          | Steve

Order table

OrderId , CustomerId
1        | 1
2        | 3
3        | 20

would give all customers with steve having no orders

### Puzzle
Write a console application that accepts a random sequence of numbers and loops through looking for 2 equal, consecutive numbers. When found write 'Snap' to the console else print out the number (e.g. 1,3,5,5,'Snap').
