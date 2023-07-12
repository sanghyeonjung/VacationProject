package com.example.vacationproject.DetailBird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.vacationproject.R

class DetailBird : AppCompatActivity() {
    val listBirdName : List<String> = listOf("새매", "딱새", "괭이갈매기", "황로")
    val listBirdDetail : List<String> = listOf(
        "수리목 수리과의 한 종\n한국에서는 텃새",
        "참새목 딱새과의 조류\n동아시아부터 몽골, 히말라야까지 분포하여 한국에서는 텃새",
        "갈매기의 일종\n괭이갈매기라는 이름 그대로 고양이 울음소리같은 소리를 낸다",
        "황로는 왜가리과의 새"
    )
    val listBirdFeatureDetail : List<String> = listOf(
        "붙잡으면 한 손에 쏙 들어올 정도로 작다. 주로 쥐나 참새같은 소형 동물을 사냥한다. 크기는 까마귀보다도 작고 까치랑 비슷한 크기지만 명색이 맹금류인만큼 전투력은 뛰어나서 1:1로 까치 정도는 제압할 수 있다.",
        "크기는 참새만하며, 다른 새들에 비해 어딘가에 앉아 꼬리를 바르르 떠는 모습을 자주 보여 쉽게 구분할 수 있다. 수컷은 검은색, 흰색, 주황색 계통의 깃털을 지녔으나 암컷은 거의 갈색에 가깝다.",
        "국내에 서식하는 갈매기들 중 가장 흔한 종류로 한국에서 갈매기라 하면 보통 괭이갈매기를 말할 정도이다. 다른 갈매기류는 겨울철새이다.",
        "몸길이는 약 51cm로 빛깔은 흰 깃털과 주황색 깃털이 섞여 있으나, 주황색 깃털의 비중이 크다. 습지나 목초지, 습지 주변의 숲 등에 서식하며 곤충·개구리·파충류·물고기·새우·쥐 등을 잡아먹는다. 푸른빛을 띤 알을 3-5개 낳으며 수십에서 수백 마리가 무리를 지어 번식한다."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bird)

        val dokdo_btn = findViewById<Button>(R.id.buttonDokdoDetailBird)
        val nextBtn = findViewById<ImageButton>(R.id.nextBtn)
        var indexNum:Int = 0

        dokdo_btn.setOnClickListener{
            finish()
            //startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


        nextBtn.setOnClickListener{
            if(indexNum == 3)
                indexNum = 0
            else
                indexNum ++
            setData(indexNum)
            
            //startActivity(Intent(this, DetailBird2::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
    private fun setData(index:Int){
        val birdNameTextView : TextView = findViewById(R.id.textviewFishName) // 새
        val birdNameTextView1 : TextView = findViewById(R.id.textviewBirdName2) // 새란?
        val birdImageView : ImageView = findViewById(R.id.imageviewFish) // 새 이미지
        val birdTextView : TextView = findViewById(R.id.textviewBird) // 새 정보
        val birdFeatureTextView : TextView = findViewById(R.id.textviewBirdFeature) // 새 특징

        birdNameTextView.text = listBirdName.get(index)
        birdNameTextView1.text = (listBirdName.get(index) + "란?")
        birdTextView.text = listBirdDetail.get(index)
        birdFeatureTextView.text = listBirdFeatureDetail.get(index)
        if(index == 0)
            birdImageView.setImageResource(R.drawable.ic_bird1)
        else if(index == 1)
            birdImageView.setImageResource(R.drawable.ic_bird2)
        else if(index == 2)
            birdImageView.setImageResource(R.drawable.ic_bird3)
        else if(index == 3)
            birdImageView.setImageResource(R.drawable.ic_bird4)
    }
}