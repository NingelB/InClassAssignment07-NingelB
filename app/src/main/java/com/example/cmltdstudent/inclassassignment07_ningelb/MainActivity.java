package com.example.cmltdstudent.inclassassignment07_ningelb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("Skill");
    private DatabaseReference skillRef = database.getReference("Math Skill");

    private TextView title;
    private TextView skill;
    private TextView grade;
    private CheckBox mastery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.title);
        skill = (TextView) findViewById(R.id.skill);
        grade = (TextView) findViewById(R.id.grade);
        mastery = (CheckBox) findViewById(R.id.mastery);
    }

    // onClick
    public void set(View view)
    {

        titleRef.setValue(title.getText().toString());

    }

    public void add(View view)
    {
        String n =skill.getText().toString();
        int p=Integer.parseInt(grade.getText().toString());
        boolean s=((CheckBox) findViewById(R.id.mastery)).isChecked();
        skillRef.push().setValue(new MathSkill(n,p,s));
    }
}