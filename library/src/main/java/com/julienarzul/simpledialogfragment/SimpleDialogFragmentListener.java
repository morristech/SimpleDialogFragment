package com.julienarzul.simpledialogfragment;

import android.content.DialogInterface;

/**
 * Created by Julien Arzul on 09/11/2016.
 * Copyright @ Julien Arzul 2016
 */
public interface SimpleDialogFragmentListener {

    void onPositiveButtonClicked(DialogInterface dialog, Integer requestCode);

    void onNegativeButtonClicked(DialogInterface dialog, Integer requestCode);
}
