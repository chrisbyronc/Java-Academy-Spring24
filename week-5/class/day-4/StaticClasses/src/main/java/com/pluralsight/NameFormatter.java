package com.pluralsight;

public class NameFormatter {

  private NameFormatter(){}

  //LastName, Prefix FirstName MiddleName, Suffix

  public static String format(String firstName,
                              String lastName) {
    return lastName + ", " + firstName;
  }
  public static String format(String prefix,
                              String firstName,
                              String middleName,
                              String lastName,
                              String suffix) {
    return String.format("%s, %s %s %s, %s", lastName, prefix, firstName, middleName, suffix);
  }
  public static String format(String fullName) {
    return fullName;
  }
}


