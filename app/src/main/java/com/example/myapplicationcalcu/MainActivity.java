package com.example.myapplicationcalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView one, two, three, four, five, six, seven, eight, nine, zero, div, multi, sub, plus, dot, equals, display, clear;
    private ImageButton backDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        display = findViewById(R.id.display);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multi);
        sub = findViewById(R.id.sub);
        plus = findViewById(R.id.plus);
        clear = findViewById(R.id.clear);
        backDelete = findViewById(R.id.backDelete);


        one.setOnClickListener((View.OnClickListener) this);
        two.setOnClickListener((View.OnClickListener) this);
        three.setOnClickListener((View.OnClickListener) this);
        four.setOnClickListener((View.OnClickListener) this);
        five.setOnClickListener((View.OnClickListener) this);
        six.setOnClickListener((View.OnClickListener) this);
        seven.setOnClickListener((View.OnClickListener) this);
        eight.setOnClickListener((View.OnClickListener) this);
        nine.setOnClickListener((View.OnClickListener) this);
        zero.setOnClickListener((View.OnClickListener) this);
        equals.setOnClickListener((View.OnClickListener) this);
        dot.setOnClickListener((View.OnClickListener) this);
        display.setOnClickListener((View.OnClickListener) this);
        div.setOnClickListener((View.OnClickListener) this);
        multi.setOnClickListener((View.OnClickListener) this);
        sub.setOnClickListener((View.OnClickListener) this);
        plus.setOnClickListener((View.OnClickListener) this);
        clear.setOnClickListener((View.OnClickListener) this);
        backDelete.setOnClickListener((View.OnClickListener) this);
    }



    public void onClick(View v) {
        if (v.findViewById(R.id.one) == one) {
            if (!display.getText().equals("")) {
                display.append("1");
            } else {
                display.setText("1");
            }
        } else if (v.findViewById(R.id.two) == two) {
            if (!display.getText().equals("")) {
                display.append("2");
            } else {
                display.setText("2");
            }
        } else if (v.findViewById(R.id.three) == three) {
            if (!display.getText().equals("")) {
                display.append("3");
            } else {
                display.setText("3");
            }
        } else if (v.findViewById(R.id.four) == four) {
            if (!display.getText().equals("")) {
                display.append("4");
            } else {
                display.setText("4");
            }
        } else if (v.findViewById(R.id.five) == five) {
            if (!display.getText().equals("")) {
                display.append("5");
            } else {
                display.setText("5");
            }
        } else if (v.findViewById(R.id.six) == six) {
            if (!display.getText().equals("")) {
                display.append("6");
            } else {
                display.setText("6");
            }
        } else if (v.findViewById(R.id.seven) == seven) {
            if (!display.getText().equals("")) {
                display.append("7");
            } else {
                display.setText("7");
            }
        } else if (v.findViewById(R.id.eight) == eight) {
            if (!display.getText().equals("")) {
                display.append("8");
            } else {
                display.setText("8");
            }
        } else if (v.findViewById(R.id.nine) == nine) {
            if (!display.getText().equals("")) {
                display.append("9");
            } else {
                display.setText("9");
            }
        } else if (v.findViewById(R.id.zero) == zero) {
            if (!display.getText().equals("")) {
                display.append("0");
            } else {
                display.setText("0");
            }
        } else if (v.findViewById(R.id.plus) == plus) {
            if (!display.getText().equals("")) {
                display.append("+");
            } else {
                display.setText("+");
            }
        } else if (v.findViewById(R.id.div) == div) {
            if (!display.getText().equals("")) {
                display.append("%");
            } else {
                display.setText("%");
            }
        } else if (v.findViewById(R.id.multi) == multi) {
            if (!display.getText().equals("")) {
                display.append("x");
            } else {
                display.setText("x");
            }
        } else if (v.findViewById(R.id.sub) == sub) {
            if (!display.getText().equals("")) {
                display.append("-");
            } else {
                display.setText("-");
            }
        } else if (v.findViewById(R.id.display) == display) {

        } else if (v.findViewById(R.id.clear) == clear) {
            display.setText(null);
        } else if (v.findViewById(R.id.equals) == equals) {
            if (!display.getText().equals("")) {
                calculate(display.getText().toString());
            } else {
                Toast.makeText(this, "Nothing to Calculate", Toast.LENGTH_SHORT).show();
            }
        } else if (v.findViewById(R.id.dot) == dot) {
            if (!display.getText().equals("")) {
                display.append(".");
            } else {
                display.setText(".");
            }
        } else if (v.findViewById(R.id.backDelete) == backDelete) {
            if (!display.getText().equals("")) {
                String s = display.getText().toString();
                if (s.length() > 0) {
                    display.setText(s.substring(0, s.length() - 1));
                } else {
                    Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "nothing to remove", Toast.LENGTH_SHORT).show();
            }

        }

    }


    private void calculate(String display) {

        Toast.makeText(this, display, Toast.LENGTH_SHORT).show();

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        MenuItem itemswitch = menu.findItem(R.id.switch_action_bar);
        itemswitch.setActionView(R.layout.use_switch);

        final Switch sw = (Switch) menu.findItem(R.id.switch_action_bar).getActionView().findViewById(R.id.switch2);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Switch is working", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return true;
    }

}