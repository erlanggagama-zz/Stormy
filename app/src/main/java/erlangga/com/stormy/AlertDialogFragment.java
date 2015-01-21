package erlangga.com.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by erlanggagama on 16/01/15.
 */
public class AlertDialogFragment extends DialogFragment {
    String mMessage;

    static AlertDialogFragment newInstance(String message) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();

        Bundle args = new Bundle();
        args.putString("error", message);
        dialogFragment.setArguments(args);
        return dialogFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        mMessage = getArguments().getString("error");
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
               .setTitle(context.getString(R.string.error_title))
               .setMessage(mMessage)
               .setPositiveButton(context.getString(R.string.error_ok_button_text), null);
        AlertDialog dialog = builder.create();
        return dialog;

    }
}
