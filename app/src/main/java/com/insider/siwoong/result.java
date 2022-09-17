package com.insider.siwoong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class result extends Activity {
    TextView name, company, meterial, how;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siwoong);

        name = findViewById(R.id.name);
        company = findViewById(R.id.company);
        meterial = findViewById(R.id.meterial);
        how = findViewById(R.id.how);

        Intent getIntent = getIntent();
        id = getIntent.getStringExtra("id");

        if(Objects.equals(id, "8801045220215"))
        {
            name.setText("오뚜기 미향");
            company.setText("주식회사 오뚜기");
            meterial.setText("용기 - PET 뚜껑 - 폴리에틸렌");
            how.setText("라벨을 제거하고 뚜껑 용기 모두 플라스틱에 버려주세요");
        }

        else if(Objects.equals(id, "8801052727752")){
            name.setText("청정원 프리미엄 굴소스");
            company.setText("대상 주식회사");
            meterial.setText("용기 - 유리 뚜껑 - 폴리에틸렌");
            how.setText("라벨을 제거하고 뚜껑은 유리 뚜껑은 플라스틱에 버려주세요");
        }

    }
}
