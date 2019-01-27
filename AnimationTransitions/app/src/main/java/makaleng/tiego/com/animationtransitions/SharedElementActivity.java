package makaleng.tiego.com.animationtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

public class SharedElementActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// inside your activity (if you did not enable transitions in your theme)
		// For AppCompat getWindow must be called before calling super.OnCreate().
		// Must be called before setContentView
		getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shared_element);

		bindControl();
		setupToolbar();
	}

	protected void setupToolbar() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle("Shared Element Transition");
	}

	@Override
	public boolean onSupportNavigateUp() {
		finishAfterTransition();
		return true;
	}

	private void bindControl() {
		findViewById(R.id.exit_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finishAfterTransition();
			}
		});
	}
}