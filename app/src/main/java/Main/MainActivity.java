package Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sameedshah_squadtech.mvppractice.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }
}
