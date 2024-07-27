package com.example.appderestaurante_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appderestaurante_java.adapter.FoodAdapter;
import com.example.appderestaurante_java.databinding.ActivityMainBinding;
import com.example.appderestaurante_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }

    private void getFood() {
        Food food1 = new Food(
                 R.drawable.food1,
                "Food 1",
                "Strogonoff: Um clássico da culinária brasileira, feito com carne em tiras, molho cremoso de mostarda e champignon",
                "R$ 50,00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Food 2",
                "Strogonoff: Um clássico da culinária brasileira, feito com carne em tiras, molho cremoso de mostarda e champignon",
                "R$ 60,00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Food 3",
                "Strogonoff: Um clássico da culinária brasileira, feito com carne em tiras, molho cremoso de mostarda e champignon",
                "R$ 70,00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Food 4",
                "Strogonoff: Um clássico da culinária brasileira, feito com carne em tiras, molho cremoso de mostarda e champignon",
                "R$ 80,00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Food 5",
                "Strogonoff: Um clássico da culinária brasileira, feito com carne em tiras, molho cremoso de mostarda e champignon",
                "R$ 90,00"
        );
        foodList.add(food5);
    }
}