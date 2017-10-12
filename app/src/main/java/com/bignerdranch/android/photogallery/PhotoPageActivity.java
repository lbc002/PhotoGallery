package com.bignerdranch.android.photogallery;


import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by lcavalli on 12/10/2017.
 */

public class PhotoPageActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context, Uri
            photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }
    @Override
    protected Fragment createFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
