What did you learn yesterday?

1. Git - (VCS) Version Control System, allows us to track changes
2. Github - Repository hosting service
3. Repository - Your app files
4. commit - saved moment in time
   1. Date
   2. Author
   3. Message
5. GIT Commands
   1. git init - Initialize a repository, ability to track changes
      1. ran once per repository
      2. cannot have parent repositories with child repositories
   2. git add {filename(s) or (all =) . -A} 
      1. setting the stage for files to be committed
      2. first thing to do to start tracking
   3. git commit -m "message for specific changes"
      1. requires a message
      2. commit to timeline
   4. git diff - compares last commit to current state of files
   5. git status - displays modified/deleted files pre and during stage
      1. ran before you add
   6. git log - displays commit history
   7. git clone - takes remote, puts on local machine
   8. git push origin main - publish commits to remote server
6.  How to get unstuck from vim
    1.  Shift + :
    2.  q + Enter
7.  Intellij - Integrated Development Environment
    1.  Java and Kotlin



Today's Objectives

1. Java
2. Java Syntax
3. Variables and Data types
4. Operations
5. Stretch goals, expressions, Scanner, methods

Agenda Today

1. Recap
2. Java
3. Syntax, Variables, and Data types
4. Break
5. Move Variables and data types
6. Lunch
7. Operations
8. Break
9. Scanner
10. Recap and Q&A


What did you learn today?

1. Java Syntax
   1. semi-colon required at the end of each executable line
   2. {} - block
2. Data Types
   1. Primitive data types
      1. int
      2. float
         1. value definition needs f
      3. double
      4. long
         1. value definition needs l
      5. char
      6. short
      7. boolean - true or false / 1 or 0
   2. Non-primitive
      1. String
3. Variables
   1. Container/Label/Representation of a value
   2. {data type} {name} = {value}
   3. reassignment, doesn't require defining data type. Must be defined data type
   4. final - constant - unchangeable or immutable
4. Math Operations
   1. +
   2. *
   3. -
   4. /
   5. ++
   6. --
   7. +=, *=, -=, /= - reassigns value to existing value (+, -, *, /) new value
   8. %
5. String Operations
   1. Concatenation
6. console output
   1. System.out.print()
   2. System.out.println() - prints a new line, CRLF
   3. System.out.printf() - prints strings, inserts formatted variables
      1. %(letter), d, s, f
7. Scanner - allows us to accept input
   1. scanner.nextInt()
   2. scanner.nextDouble()
   3. scanner.nextFloat()
   4. scanner.nextLine()
   5. scanner.nextBoolean()