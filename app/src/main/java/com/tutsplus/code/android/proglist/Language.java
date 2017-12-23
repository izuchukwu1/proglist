package com.tutsplus.code.android.proglist;

public class Language {
  private String name;
  private String description;
  private int imageResourceId;

  //langauges is an array of Languages
  public static final Language[] languages = {
          new Language("JavaScript", "JavaScript, often abbreviated as JS, is a high-level, " +
                  "dynamic, weakly typed, prototype-based, multi-paradigm, and interpreted " +
                  "programming language.", R.drawable.javascript),
          new Language("Java", "Java is a general-purpose computer programming language that is " +
                  "concurrent, class-based, object-oriented, and specifically designed to have as" +
                  " few implementation dependencies as possible.", R.drawable.java),
          new Language("Ruby", "Ruby is a dynamic, reflective, object-oriented, general-purpose " +
                  "programming language. It was designed and developed in the mid-1990s by " +
                  "Yukihiro \"Matz\" Matsumoto in Japan.", R.drawable.ruby)
  };

  //Each language has a name, description, and an image resource
  private Language(String name, String description, int imageResourceId){
    this.name = name;
    this.description = description;
    this.imageResourceId = imageResourceId;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getImageResourceId() {
    return imageResourceId;
  }

  public String toString() {
    return this.name;
  }
}
