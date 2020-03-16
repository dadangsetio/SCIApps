package id.repairzone.sciapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toListActivity(View view){
        Move(ListItem.class);
    }
    public void toProcessActivity(View view){
        Move(Process.class);
    }
    public void toRequestItem(View view){
        Move(RequestItem.class);
    }
    public void toAddItem(View view){
        Move(AddItem.class);
    }
    public void toRecentActivty(View view){
        Move(Recent.class);
    }

    public void Move(Class move){
        Intent intent = new Intent(this, move);
        startActivity(intent);
    }
}
