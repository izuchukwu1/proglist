package com.tutsplus.code.android.proglist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageActivity extends Activity {

  public static final String EXTRA_LANGUAGEID = "languageId";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_language);

    int languageId = (Integer)getIntent().getExtras().get(EXTRA_LANGUAGEID);
    Language language = Language.languages[languageId];

    TextView name = (TextView) findViewById(R.id.name);
    name.setText(language.getName());

    TextView description = (TextView) findViewById(R.id.description);
    description.setText(language.getDescription());

    ImageView photo = (ImageView) findViewById(R.id.photo);
    photo.setImageResource(language.getImageResourceId());
    photo.setContentDescription(language.getName());
  }
}
