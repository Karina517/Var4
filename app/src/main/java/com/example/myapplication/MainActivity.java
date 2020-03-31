package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.recycler);
        MyAdapter adapter = new MyAdapter(getData(), this);
        view.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);
        view.setLayoutManager(manager);
    }

    public ArrayList<Party> getData() {
        ArrayList<Party> data = new ArrayList<>();
        data.add(new Party("Прогулка по Неве", " Дворецевая наб., д. 18", "03.05", "00:55", "4,7 km", "https://turproezdka.ru/wp-content/uploads/2018/07/ris.-2.-razvodnye-mosty-v-pitere.jpg", "Увлекательная прогулка по Питеру мимо основных достопримечательностей города и прекрасных разведенных мстов... Ждем вас в нашем путешествии по всей Неве!", "https://turproezdka.ru/wp-content/uploads/2018/07/ris.-2.-razvodnye-mosty-v-pitere.jpg"));
        data.add(new Party("День родения Марка", "2-ая Советская улица, д. 27", "28.04", "19:30", "8 km", " https://cdn.fishki.net/upload/post/2020/03/26/3268288/2e6fe630d1ab610429baa0e14a933fdd.jpg", "Давайте устроим ему лучшую вечеринку! Будет весело! Приходи!", "https://cdn.fishki.net/upload/post/2020/03/26/3268288/2e6fe630d1ab610429baa0e14a933fdd.jpg"));
        data.add(new Party("Домашний кинотеатр", "Лесной пр., д. 63", "01.04", "18:00", "10 km", " http://dizajn-gostinoj.ru/wp-content/uploads/2017/04/Domashniy-kinoteatr-v-gostinoy-11.jpg", "Ждем вас на еженедельный совместный просмотр киноленты. Выбор фильма в группе вк.", "http://dizajn-gostinoj.ru/wp-content/uploads/2017/04/Domashniy-kinoteatr-v-gostinoy-11.jpg"));
        data.add(new Party("Вечерний кофе", "Ленинский пр., д. 23", "02.04", "20:30", "6,1 km", " https://design-interno.ru/media/djcatalog2/images/item/0/proekt-23_f.jpg", "В этом месте варят лучший кофе... Приходите и убедись сами!", "https://design-interno.ru/media/djcatalog2/images/item/0/proekt-23_f.jpg"));
        return data;
    }
}

