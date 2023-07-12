package com.example.vacationproject.DetailFish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.vacationproject.R

class DetailFish : AppCompatActivity() {
    val listFishName : List<String> = listOf(
        "왕벚꽃하늘소갯민숭이",
        "혹돔",
        "흰갯민숭달팽이",
        "예쁜이갯민숭이")
    val listFishDetail : List<String> = listOf(
        "독도 바다의 달팽이",
        "독도 앞바다에 서식하는 가장 큰 물고기\n머리에 사과만 한 혹이 나 있어서 혹돔이라 부름",
        "독도 바다의 달팽이",
        "독도 바다의 육식성 포식자"
    )
    val listFishFeatureDetail : List<String> = listOf(
        "독도 바다에서 봄~여름철에 볼 수 있으며, 몸통 길이는 3~4cm 정도이다. 산호나 히드라와 같은 자포동물을 주로 먹으며, 먹이로부터 섭취한 독침을 아가미 돌기 끝에 저장하여 자신을 포식하려는 적들에 대한 방어무기로 활용한다.",
        "낮에 확동하다가, 밤이 되면 바위 틈이나 굴 속에서 우리처럼 잠을 잔다. 혹돔들이 무리를 지어 자는 바위를 혹돔굴이라고 한다.",
        "흰색 바탕에 검은색 점과 노란색 가장자리 테두리로 인해 독도 바닷속에서 가장 흔히, 쉽게 발견되는 갯민숭이류이다. 몸통 길이는 4cm 내외이며, 몸통의 수축과 이완에 따라 길이는 2배까지 차이나며, 해조류 포자나 이끼벌레 또는 옆새우류와 같은 중소형 저서동물을 먹는 잡식자이다.",
        "독도를 포함하여 난류의 영향을 받는 비교적 고수온 해역에서 주로 서식한다. 몸통 길이는 4cm 내외이며, 등 면에는 좌우대칭의 흰색 무늬가 있다. 말미잘, 산호 또는 히드라와 같은 자포동물의 촉수를 뜯어 먹는 육식성 포식자이다."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_fish)
        val dokdo_btn = findViewById<Button>(R.id.buttonDokdoDetailHair)
        val next_btn = findViewById<ImageButton>(R.id.nextBtn)
        var indexNum:Int = 0

        next_btn.setOnClickListener{
            if(indexNum == 3)
                indexNum = 0
            else
                indexNum ++
            setData(indexNum)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dokdo_btn.setOnClickListener{
            finish()
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
    private fun setData(index:Int){
        val fishNameTextView : TextView = findViewById(R.id.textviewFishName) // 새
        val fishNameTextView1 : TextView = findViewById(R.id.textviewFishName2) // 새란?
        val fishImageView : ImageView = findViewById(R.id.imageviewFish) // 새 이미지
        val fishTextView : TextView = findViewById(R.id.textviewFish) // 새 정보
        val fishFeatureTextView : TextView = findViewById(R.id.textviewFishFeature) // 새 특징

        fishNameTextView.text = listFishName.get(index)
        fishNameTextView1.text = (listFishName.get(index) + "란?")
        fishTextView.text = listFishDetail.get(index)
        fishFeatureTextView.text = listFishFeatureDetail.get(index)
        if(index == 0)
            fishImageView.setImageResource(R.drawable.ic_hair_detail)
        else if(index == 1)
            fishImageView.setImageResource(R.drawable.ic_redfish)
        else if(index == 2)
            fishImageView.setImageResource(R.drawable.ic_whitefish)
        else if(index == 3)
            fishImageView.setImageResource(R.drawable.ic_whiteslime)
    }
}