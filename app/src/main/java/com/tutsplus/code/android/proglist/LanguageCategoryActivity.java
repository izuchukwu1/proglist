package com.tutsplus.code.android.proglist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LanguageCategoryActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_language_category);
    ArrayAdapter<Language> listAdapter = new ArrayAdapter<>(this, android.R.layout
            .simple_list_item_1, Language.languages);
    ListView listLanguages = (ListView) findViewById(R.id.list_languages);
    listLanguages.setAdapter(listAdapter);

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(LanguageCategoryActivity.this, LanguageActivity.class);
        intent.putExtra(LanguageActivity.EXTRA_LANGUAGEID, (int) id);
        startActivity(intent);
      }
    };

    listLanguages.setOnItemClickListener(itemClickListener);
  }
}















