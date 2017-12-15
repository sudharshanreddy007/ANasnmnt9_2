package com.example.user.anasnmnt9_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

//import is simply used by the compiler to let you name your classes by their unqualified name

public class MainActivity extends AppCompatActivity {
    //here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().
        super.onCreate(savedInstanceState);
        //// call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        //we are inflating the menu by calling the inflate() method of MenuInflater class. To perform event handling on menu items,
        // you need to override onOptionsItemSelected() method of Activity class.
        return true;
    }

    //In onOptionsItemSelected adding switch case to show which item is selected as a Toast
     /*Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc.
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //respond to menu item selection.The system will automatically call the "onOptionsItemSelected" method when
        // the user chooses any of the options menu items.
        //switch statement executes one statement from multiple conditions
        switch (item.getItemId())
        // getItemId() method queries the ID for the selected menu item, which you should assign to each menu item
        // in XML using the android:id attribute
        {
            //Add a case statement for each item in your menu.
            case R.id.Computer:
                //this refers to the id which is given in layout xml file

                Toast.makeText(getApplicationContext(), "Computer is selected", Toast.LENGTH_LONG).show();
                //getApplicationContext() - Return the context of the process of all activity running inside it.
                // If you need a context that bind entire lifecycle of application you can use this.
                //toast is a view containing a quick little message for the user.
                //LENGTH_LONG Show the view or text notification for a long period of time.
                //instantiate a Toast object with one of the makeText() methods. This method takes three parameters: the application Context,
                // the text message, and the duration for the toast. It returns a properly initialized Toast object. You can display the toast notification with show(),

                break;
            case R.id.Gamepad:
                Toast.makeText(getApplicationContext(), "Gamepad is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Camera:
                Toast.makeText(getApplicationContext(), "Camera is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Video:
                Toast.makeText(getApplicationContext(), "Video is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.EMail:
                Toast.makeText(getApplicationContext(), "EMail is selected", Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}