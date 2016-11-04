package gabriel.gdgesk.gabriel.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gabriel.gdgesk.gabriel.R;

public class ChatsListFragment extends Fragment {
    public static ChatsListFragment newInstance() {
        return new ChatsListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats_list, container, false);

        return view;
    }
}
