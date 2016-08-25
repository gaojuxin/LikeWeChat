package example.com.likewechat.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import example.com.likewechat.Fruit;
import example.com.likewechat.FruitAdapter;
import example.com.likewechat.R;
import example.com.likewechat.fruitDetailActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
private ListView fruitlist;
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    private Fruit fruit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        fruitlist = (ListView)view.findViewById(R.id.fruit_list);
        final FruitAdapter fruitAdapter = new FruitAdapter(getActivity(),R.layout.fruitlistitem,fruitList);
        fruitlist.setAdapter(fruitAdapter);
        initView();
        fruitlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit select_fruit =(Fruit)fruitAdapter.getItem(position);
                Intent intent = new Intent(getActivity(),fruitDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",select_fruit.getName());
                bundle.putString("desc",select_fruit.getDesc());
                bundle.putInt("imgId",select_fruit.getImgId());
                //intent.putExtra("name",select_fruit.getName());
                //intent.putExtra("desc",select_fruit.getDesc());
               // intent.putExtra("imgId",select_fruit.getImgId());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        return view;
    }

    private void initView() {
        Fruit apple=new Fruit(R.drawable.apple,"Apple","这是一个苹果");
        fruitList.add(apple);
        Fruit orange=new Fruit(R.drawable.apple,"Orange","这是一个橘子");
        fruitList.add(orange);
        Fruit banana=new Fruit(R.drawable.apple,"Banana","这是一个香蕉");
        fruitList.add(banana);
        Fruit watermelon=new Fruit(R.drawable.apple,"Watermelon","这是一个西瓜");
        fruitList.add(watermelon);
        Fruit pear=new Fruit(R.drawable.apple,"Pear","");
        fruitList.add(pear);
        Fruit grape=new Fruit(R.drawable.apple,"Grape","");
        fruitList.add(grape);
        Fruit mango=new Fruit(R.drawable.apple,"Mango","");
        fruitList.add(mango);
        Fruit strawberry=new Fruit(R.drawable.apple,"StrawBerry","");
        fruitList.add(strawberry);
        Fruit cherry=new Fruit(R.drawable.apple,"Cherry","");
        fruitList.add(cherry);

    }

    }


