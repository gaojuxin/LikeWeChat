package example.com.likewechat.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import example.com.likewechat.R;
import example.com.likewechat.chatToImgActivity;
import example.com.likewechat.chatToTextActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {
private Button chat2text,chat2img;

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        chat2text = (Button)view.findViewById(R.id.chatBtnText);
        chat2img = (Button)view.findViewById(R.id.chatBtnImg) ;
        chat2text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),chatToTextActivity.class);
                startActivity(intent);
            }
        });
        chat2img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),chatToImgActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
