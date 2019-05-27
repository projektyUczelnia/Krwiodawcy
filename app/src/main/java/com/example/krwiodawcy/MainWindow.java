package com.example.krwiodawcy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

public class MainWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

        FloatingActionButton floatingActionButtonAddDonation = findViewById(R.id.floatingActionButtonAddDonation);
        floatingActionButtonAddDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainWindow.this, BloodDonation.class);
                startActivity(intent);
            }
        });


        FloatingActionButton floatingActionButtonAddMesseges = findViewById(R.id.floatingActionButtonAddMesseges);
        floatingActionButtonAddMesseges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainWindow.this, Messages.class);
                startActivity(intent);
            }
        });


        final FloatingActionButton floatingActionButton3 = findViewById(R.id.floatingActionButton3);
        registerForContextMenu(floatingActionButton3);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Menu");
        menu.add(0, v.getId(), 0, "DZIENNIK KRWI");
        menu.add(1, v.getId(), 0, "NADCHODZCE WYDARZENIA");
        menu.add(2, v.getId(), 0, "ODZNACZENIA");
        menu.add(3, v.getId(), 0, "WIADOMOŚĆ DO ZARZADU");
        menu.add(4, v.getId(), 0, "PUNKTY POBORU KRWI");
        menu.add(5, v.getId(), 0, "O KLUBIE?");
        menu.add(6, v.getId(), 0, "O ODDAWANAIU KRWI");
        menu.add(7, v.getId(), 0, "INFORMACJE OSOBOWE");
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getGroupId()) {
            case 0:
                Intent intent = new Intent(MainWindow.this, BloodLogActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intentEvents = new Intent(MainWindow.this, EventsActivity.class);
                startActivity(intentEvents);
                break;
            case 2:
                Intent intentBadges = new Intent(MainWindow.this, BadgesActivity.class);
                startActivity(intentBadges);
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
        }

        return super.onContextItemSelected(item);
    }
}
