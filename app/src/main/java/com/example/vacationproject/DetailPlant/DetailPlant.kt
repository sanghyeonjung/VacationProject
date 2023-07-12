package com.example.vacationproject.DetailPlant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.vacationproject.MainActivity
import com.example.vacationproject.R

class DetailPlant : AppCompatActivity() {
    val listPlantName : List<String> = listOf(
        "사철나무",
        "해국",
        "땅채송화",
        "참나리",
        "검정배줄벼룩잎벌레",
        "해변에녹슬은방아벌레",
        "애남생이잎벌레",
        "참소리쟁이애좁쌀바구미",
        "긴뺨모래거저리",
        "소나무무당벌레"
        )
    val listPlantDetail : List<String> = listOf(
        "사철 잎이 푸른 나무",
        "독도의 햇볕이 잘 드는 암벽이나 경사진 곳에서 자라는 대한민국 자생식물",
        "돌나무과의 여러해살이풀",
        "참나리는 백합과의 여러해살이풀\n백합, 나리, 알나리로 불린다",
        "잎벌레과 벼룩잎벌레아과",
        "방아벌레과, 땅방아벌레아과, 녹슬은방아벌레족",
        "남생이잎벌레족",
        "애좁쌀바구미족",
        "거저리과",
        "무당벌레와 매우 비슷하지만 딱지날개 끝부분이 더 뾰족한 벌레"
    )
    val listPlantFeatureDetail : List<String> = listOf(
        "키는 3~5m쯤 되며 생울타리로 많이 심어 기르며 추위와 공해에 강하다. 나무껍질은 흑갈색으로 얕게 갈라진다. 잎은 마주나고 타원 모양이며 가죽질이다.",
        "키는 3~5m쯤 되며 생울타리로 많이 심어 기르며 추위와 공해에 강하다. 나무껍질은 흑갈색으로 얕게 갈라진다. 잎은 마주나고 타원 모양이며 가죽질이다.",
        "땅채송화의 다육질의 긴 줄기에서 곧추서는 줄기와 실뿌리가 나며 바닷가의 바위틈이나 모래땅에서 자라는 여러해살이풀. 높이는5~15cm이다. 잎은 어긋나며 넓은 선형으로 길이 2에서 5mm로 자라며 자른 면은 반타원형이다.",
        "줄기의 높이는 1-2m 정도이며, 어린 가지에는 흰색의 잔털이 나 있다. 꽃은 황적색으로 짙은 자색의 반점이 있다.",
        "한국, 일본, 중국, 타이완, 인도차이나, 수마트라 등지에 분포한다. 기주식물은 유채, 배추 등 십자화과 식물이다.",
        "한국, 일본, 유럽에 분포하며, 체장은 16mm 내외이다. 머리는 앞가슴에 퇴축하고 앞머리는 오목하고 전면에 조대한 감각을 밀포하였다.",
        "체장은 5.0~5.5mm이며, 체형은 둥근 원형으로 되어있다. 보편적으로 적갈색을 띄고 있고, 위날개에 다수의 불규칙한 흑색의 무늬를 가지고 있다.",
        "한국, 일본, 몽골, 러시아에 분포한다. 몸길이는 3.0~3.4mm이다. 체색은 검은색, 더듬이 곤봉마디와 다리 부절은 적갈색을 띈다. 딱지날개 간실에 혹돌기가 없다.",
        "몸길이는 7.0~9.5mm이다. 몸의 색깔은 흑갈색이며, 표면에는 짧은 적황색 털이 조밀하게 덮여 있다. 몸의 형태는 장방형이고, 측연은 거의 평행하며, 등 면은 볼록하다. 머리의 형태는 납작하고, 표면에는 주름과 점각이 있다. 겹눈 간의 거리는 겹눈의 지름보다 약 4배 더 넓다.",
        "색상과 무늬의 변이가 심하다. 무당벌레처럼 몸통 끝부분이 움푹파여있지 않다. "
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_plant)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailPlant)
        val nextBtn = findViewById<ImageButton>(R.id.nextBtn)
        var indexNum:Int = 0

        dockdo_btn.setOnClickListener{
            finish()
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


        nextBtn.setOnClickListener{
            if(indexNum == 9)
                indexNum = 0
            else
                indexNum ++
            setData(indexNum)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
    private fun setData(index:Int){
        val plantNameTextView : TextView = findViewById(R.id.textviewPlantName) // 새
        val plantNameTextView1 : TextView = findViewById(R.id.textviewPlantName2) // 새란?
        val plantImageView : ImageView = findViewById(R.id.imageviewPlant) // 새 이미지
        val plantTextView : TextView = findViewById(R.id.textviewPlant) // 새 정보
        val plantFeatureTextView : TextView = findViewById(R.id.textviewPlantFeature) // 새 특징

        plantNameTextView.text = listPlantName.get(index)
        plantNameTextView1.text = (listPlantName.get(index) + "란?")
        plantTextView.text = listPlantDetail.get(index)
        plantFeatureTextView.text = listPlantFeatureDetail.get(index)
        if(index == 0)
            plantImageView.setImageResource(R.drawable.ic_plant)
        else if(index == 1)
            plantImageView.setImageResource(R.drawable.ic_plant_2)
        else if(index == 2)
            plantImageView.setImageResource(R.drawable.ic_plant_3)
        else if(index == 3)
            plantImageView.setImageResource(R.drawable.ic_plant_4)
        else if(index == 4)
            plantImageView.setImageResource(R.drawable.ic_insect1)
        else if(index == 5)
            plantImageView.setImageResource(R.drawable.ic_insect2)
        else if(index == 6)
            plantImageView.setImageResource(R.drawable.ic_insect3)
        else if(index == 7)
            plantImageView.setImageResource(R.drawable.ic_insect4)
        else if(index == 8)
            plantImageView.setImageResource(R.drawable.ic_insect5)
        else if(index == 9)
            plantImageView.setImageResource(R.drawable.ic_insect6)
    }
}