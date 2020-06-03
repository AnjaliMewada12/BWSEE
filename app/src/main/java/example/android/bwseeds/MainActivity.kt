package example.android.bwseeds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    var ch1:Boolean=true
    var ch2:Boolean=false
    var i:Int=0
    var j:Int=0
    var initialX:Int=33
    var initialY:Int=33
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.but).setOnClickListener{clicked(it)}
        findViewById<Button>(R.id.click1).setOnClickListener{person1(it)}
        findViewById<Button>(R.id.click2).setOnClickListener{person2(it)}
    }

    private fun clicked(view:View){
        var blank1=findViewById<LinearLayout>(R.id.blank1)
        blank1.visibility=View.GONE
        var bw=findViewById<LinearLayout>(R.id.bw)
        bw.visibility=View.GONE
        var blank2=findViewById<LinearLayout>(R.id.blank2)
        blank2.visibility=View.GONE
        var seeds=findViewById<TextView>(R.id.seeds)
        seeds.visibility=View.GONE
        var blank3=findViewById<LinearLayout>(R.id.blank3)
        blank3.visibility=View.GONE
        view.visibility=View.GONE
        var blank4=findViewById<LinearLayout>(R.id.blank4)
        blank4.visibility=View.GONE
        var lay1=findViewById<LinearLayout>(R.id.lay1)
        lay1.visibility=View.VISIBLE
        var lay2=findViewById<LinearLayout>(R.id.lay2)
        lay2.visibility=View.VISIBLE
        var lay3=findViewById<LinearLayout>(R.id.lay3)
        lay3.visibility=View.VISIBLE
    }
    fun winX(){
        var lay1=findViewById<LinearLayout>(R.id.lay1)
        lay1.visibility=View.GONE
        var lay2=findViewById<LinearLayout>(R.id.lay2)
        lay2.visibility=View.GONE
        var lay3=findViewById<LinearLayout>(R.id.lay3)
        lay3.visibility=View.GONE
        var win1=findViewById<LinearLayout>(R.id.win1)
        win1.visibility=View.VISIBLE

    }
    fun winY(){
        var lay1=findViewById<LinearLayout>(R.id.lay1)
        lay1.visibility=View.GONE
        var lay2=findViewById<LinearLayout>(R.id.lay2)
        lay2.visibility=View.GONE
        var lay3=findViewById<LinearLayout>(R.id.lay3)
        lay3.visibility=View.GONE
        var win2=findViewById<LinearLayout>(R.id.win2)
        win2.visibility=View.VISIBLE
    }
    fun checkX(score:Int){
        var b11=findViewById<Button>(R.id.but11)
        var b12=findViewById<Button>(R.id.but12)
        var b13=findViewById<Button>(R.id.but13)
        var b14=findViewById<Button>(R.id.but14)
        var b15=findViewById<Button>(R.id.but15)
        var b21=findViewById<Button>(R.id.but21)
        var b22=findViewById<Button>(R.id.but22)
        var b23=findViewById<Button>(R.id.but23)
        var b24=findViewById<Button>(R.id.but24)
        var b25=findViewById<Button>(R.id.but25)
        var b31=findViewById<Button>(R.id.but31)
        var b32=findViewById<Button>(R.id.but32)
        var b33=findViewById<Button>(R.id.but33)
        var b34=findViewById<Button>(R.id.but34)
        var b35=findViewById<Button>(R.id.but35)
        var b41=findViewById<Button>(R.id.but41)
        var b42=findViewById<Button>(R.id.but42)
        var b43=findViewById<Button>(R.id.but43)
        var b44=findViewById<Button>(R.id.but44)
        var b45=findViewById<Button>(R.id.but45)
        var b51=findViewById<Button>(R.id.but51)
        var b52=findViewById<Button>(R.id.but52)
        var b53=findViewById<Button>(R.id.but53)
        var b54=findViewById<Button>(R.id.but54)
        var b55=findViewById<Button>(R.id.but55)
        if(initialX==33 && score==1){
            if(b33.text=="X")
            {
                b33.text=""
            }
            else{
                b33.text="O"
            }
            initialX=23
            if(b23.text==""){
                b23.text="X"
            }
            else{
                b33.text="O"
                initialY=33
                b23.text="X"
            }
        }
        else if(initialX==23){
            if(b23.text=="X")
            {
                b23.text=""
            }
            else{
                b23.text="O"
            }
             if(score==1){
                 initialX=22
                 if(b22.text==""){
                     b22.text="X"
                 }
                 else{
                     b33.text="O"
                     initialY=33
                     b22.text="X"
                 }
             }
             else if(score==2){
                 initialX=32
                 if(b32.text==""){
                     b32.text="X"
                 }
                 else{
                     b33.text="O"
                     initialY=33
                     b32.text="X"
                 }
             }
             else if(score==3){
                 initialX=42
                 if(b42.text==""){
                     b42.text="X"
                 }
                 else{
                     b33.text="O"
                     initialY=33
                     b42.text="X"
                 }
             }
             else{
                 initialX=43
                 if(b43.text==""){
                     b43.text="X"
                 }
                 else{
                     b33.text="O"
                     initialY=33
                     b43.text="X"
                 }
             }
        }
        else if(initialX==22){
            if(b22.text=="X")
            {
                b22.text=""
            }
            else{
                b22.text="O"
            }
            if(score==1){
                initialX=32
                if(b32.text==""){
                    b32.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b32.text="X"
                }
            }
            else if(score==2){
                initialX=42
                if(b42.text==""){
                    b42.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b42.text="X"
                }
            }
            else if(score==3){
                initialX=43
                if(b43.text==""){
                    b43.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b43.text="X"
                }
            }
            else{
                initialX=44
                if(b44.text==""){
                    b44.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b44.text="X"
                }
            }
        }
        else if(initialX==32){
            if(b32.text=="X")
            {
                b32.text=""
            }
            else{
                b32.text="O"
            }
            if(score==1){
                initialX=42
                if(b42.text==""){
                    b42.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b42.text="X"
                }
            }
            else if(score==2){
                initialX=43
                if(b43.text==""){
                    b43.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b43.text="X"
                }
            }
            else if(score==3){
                initialX=44
                if(b44.text==""){
                    b44.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b44.text="X"
                }
            }
            else{
                initialX=34
                if(b34.text==""){
                    b34.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b34.text="X"
                }
            }
        }
        else if(initialX==42 && score==2){
            if(b42.text=="X")
            {
                b42.text=""
            }
            else{
                b42.text="O"
            }
            initialX=44
            if(b44.text==""){
                b44.text="X"
            }
            else{
                b33.text="O"
                initialY=33
                b44.text="X"
            }
        }
        else if(initialX==43){
            if(b43.text=="X")
            {
                b43.text=""
            }
            else{
                b43.text="O"
            }
            if(score==1){
                initialX=44
                if(b44.text==""){
                    b44.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b44.text="X"
                }
            }
            else if(score==2){
                initialX=34
                if(b34.text==""){
                    b34.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b34.text="X"
                }
            }
            else if(score==3){
                initialX=24
                if(b24.text==""){
                    b24.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b24.text="X"
                }
            }
            else{
                initialX=14
                if(b14.text==""){
                    b14.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b14.text="X"
                }
            }
        }
        else if(initialX==44){
            if(b44.text=="X")
            {
                b44.text=""
            }
            else{
                b44.text="O"
            }
            if(score==1){
                initialX=34
                if(b34.text==""){
                    b34.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b34.text="X"
                }
            }
            else if(score==2){
                initialX=24
                if(b24.text==""){
                    b24.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b24.text="X"
                }
            }
            else if(score==3){
                initialX=14
                if(b14.text==""){
                    b14.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b14.text="X"
                }
            }
            else{
                initialX=15
                if(b15.text==""){
                    b15.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b15.text="X"
                }
            }
        }
        else if(initialX==34){
            if(b34.text=="X")
            {
                b34.text=""
            }
            else{
                b34.text="O"
            }
            if(score==1){
                initialX=24
                if(b24.text==""){
                    b24.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b24.text="X"
                }
            }
            else if(score==2){
                initialX=14
                if(b14.text==""){
                    b14.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b14.text="X"
                }
            }
            else if(score==3){
                initialX=15
                if(b15.text==""){
                    b15.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b15.text="X"
                }
            }
            else{
                initialX=25
                if(b25.text==""){
                    b25.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b25.text="X"
                }
            }
        }
        else if(initialX==24 && score==2){
            if(b24.text=="X")
            {
                b24.text=""
            }
            else{
                b24.text="O"
            }
            initialX=15
            if(b15.text==""){
                b15.text="X"
            }
            else{
                b33.text="O"
                initialY=33
                b15.text="X"
            }
        }
        else if(initialX==14){
            if(b14.text=="X")
            {
                b14.text=""
            }
            else{
                b14.text="O"
            }
            if(score==1){
                initialX=15
                if(b15.text==""){
                    b15.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b15.text="X"
                }
            }
            else if(score==2){
                initialX=25
                if(b25.text==""){
                    b25.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b25.text="X"
                }
            }
            else if(score==3){
                initialX=35
                if(b35.text==""){
                    b35.text="X"
                }
                else{
                    b35.text="X O"
                }
            }
            else{
                initialX=45
                if(b45.text==""){
                    b45.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b45.text="X"
                }
            }
        }
        else if(initialX==15){
            if(b15.text=="X")
            {
                b15.text=""
            }
            else{
                b15.text="O"
            }
            if(score==1){
                initialX=25
                if(b25.text==""){
                    b25.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b25.text="X"
                }
            }
            else if(score==2){
                initialX=35
                if(b35.text==""){
                    b35.text="X"
                }
                else{
                    b35.text="X O"
                }
            }
            else if(score==3){
                initialX=45
                if(b45.text==""){
                    b45.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b45.text="X"
                }
            }
            else{
                initialX=55
                if(b55.text==""){
                    b55.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b55.text="X"
                }
            }
        }
        else if(initialX==25 && score==3){
            if(b25.text=="X")
            {
                b25.text=""
            }
            else{
                b25.text="O"
            }
            initialX=55
            if(b55.text==""){
                b55.text="X"
            }
            else{
                b33.text="O"
                initialY=33
                b55.text="X"
            }
        }
        else if(initialX==35){
            if(b35.text=="X")
            {
                b35.text=""
            }
            else{
                b35.text="O"
            }
            if(score==1){
                initialX=45
                if(b45.text==""){
                    b45.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b45.text="X"
                }
            }
            else if(score==2){
                initialX=55
                if(b55.text==""){
                    b55.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b55.text="X"
                }
            }
            else if(score==3){
                initialX=54
                if(b54.text==""){
                    b54.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b54.text="X"
                }
            }
            else{
                initialX=53
                if(b53.text==""){
                    b53.text="X"
                }
                else{
                    b53.text="X O"
                }
            }
        }
        else if(initialX==45){
            if(b45.text=="X")
            {
                b45.text=""
            }
            else{
                b45.text="O"
            }
            if(score==1){
                initialX=55
                if(b55.text==""){
                    b55.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b55.text="X"
                }
            }
            else if(score==2){
                initialX=54
                if(b54.text==""){
                    b54.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b54.text="X"
                }
            }
            else if(score==3){
                initialX=53
                if(b53.text==""){
                    b53.text="X"
                }
                else{
                    b53.text="X O"
                }
            }
            else{
                initialX=52
                if(b52.text==""){
                    b52.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b52.text="X"
                }
            }
        }
        else if(initialX==55){
            if(b55.text=="X")
            {
                b55.text=""
            }
            else{
                b55.text="O"
            }
            if(score==1){
                initialX=54
                if(b54.text==""){
                    b54.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b54.text="X"
                }
            }
            else if(score==2){
                initialX=53
                if(b53.text==""){
                    b53.text="X"
                }
                else{
                    b53.text="X O"
                }
            }
            else if(score==3){
                initialX=52
                if(b52.text==""){
                    b52.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b52.text="X"
                }
            }
            else{
                initialX=51
                if(b51.text==""){
                    b51.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b51.text="X"
                }
            }
        }
        else if(initialX==54 && score==1) {
            if(b54.text=="X")
            {
                b54.text=""
            }
            else {
                b54.text = "O"
            }
            initialX = 53
            if (b53.text == "") {
                b53.text = "X"
            } else {
                b53.text = "X O"
            }
        }
        else if(initialX==53){
            if(b53.text=="X")
            {
                b53.text=""
            }
            else{
                b53.text="O"
            }
            if(score==1){
                initialX=52
                if(b52.text==""){
                    b52.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b52.text="X"
                }
            }
            else if(score==2){
                initialX=51
                if(b51.text==""){
                    b51.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b51.text="X"
                }
            }
            else if(score==3){
                initialX=41
                if(b41.text==""){
                    b41.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b41.text="X"
                }
            }
            else{
                initialX=31
                if(b31.text==""){
                    b31.text="X"
                }
                else{
                    b31.text="X O"
                }
            }
        }
        else if(initialX==52){
            if(b52.text=="X")
            {
                b52.text=""
            }
            else{
                b52.text="O"
            }
            if(score==1){
                initialX=51
                if(b51.text==""){
                    b51.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b51.text="X"
                }
            }
            else if(score==2){
                initialX=41
                if(b41.text==""){
                    b41.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b41.text="X"
                }
            }
            else if(score==3){
                initialX=31
                if(b31.text==""){
                    b31.text="X"
                }
                else{
                    b31.text="X O"
                }
            }
            else{
                initialX=21
                if(b21.text==""){
                    b21.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b21.text="X"
                }
            }
        }
        else if(initialX==51){
            if(b51.text=="X")
            {
                b51.text=""
            }
            else{
                b51.text="O"
            }
            if(score==1){
                initialX=41
                if(b41.text==""){
                    b41.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b41.text="X"
                }
            }
            else if(score==2){
                initialX=31
                if(b31.text==""){
                    b31.text="X"
                }
                else{
                    b31.text="X O"
                }
            }
            else if(score==3){
                initialX=21
                if(b21.text==""){
                    b21.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b21.text="X"
                }
            }
            else{
                initialX=11
                if(b11.text==""){
                    b11.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b11.text="X"
                }
            }
        }
        else if(initialX==41 && score==3) {
            if(b41.text=="X")
            {
                b41.text=""
            }
            else{
                b41.text="O"
            }
            initialX = 11
            if (b11.text == "") {
                b11.text = "X"
            } else {
                b33.text="O"
                initialY=33
                b11.text="X"
            }
        }
        else if(initialX==31){
            if(b31.text=="X")
            {
                b31.text=""
            }
            else{
                b31.text="O"
            }
            if(score==1){
                initialX=21
                if(b21.text==""){
                    b21.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b21.text="X"
                }
            }
            else if(score==2){
                initialX=11
                if(b11.text==""){
                    b11.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b11.text="X"
                }
            }
            else if(score==3){
                initialX=12
                if(b12.text==""){
                    b12.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b12.text="X"
                }
            }
            else{
                initialX=13
                if(b13.text==""){
                    b13.text="X"
                }
                else{
                    b13.text="X O"
                }
                winX()
            }
        }
        else if(initialX==21){
            if(b21.text=="X")
            {
                b21.text=""
            }
            else{
                b21.text="O"
            }
            if(score==1){
                initialX=11
                if(b11.text==""){
                    b11.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b11.text="X"
                }
            }
            else if(score==2){
                initialX=51
                if(b12.text==""){
                    b12.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b12.text="X"
                }
            }
            else if(score==3){
                initialX=13
                if(b13.text==""){
                    b13.text="X"
                }
                else{
                    b13.text="X O"
                }
                winX()
            }
        }
        else if(initialX==11){
            if(b11.text=="X")
            {
                b11.text=""
            }
            else{
                b11.text="O"
            }
            if(score==1){
                initialX=12
                if(b12.text==""){
                    b12.text="X"
                }
                else{
                    b33.text="O"
                    initialY=33
                    b12.text="X"
                }
            }
            else if(score==2){
                initialX=13
                if(b13.text==""){
                    b13.text="X"
                }
                else{
                    b13.text="X O"
                }
                winX()
            }

        }
        else if(initialX==12 && score==1) {
            if(b12.text=="X")
            {
                b12.text=""
            }
            else{
                b12.text="O"
            }
            initialX = 13
            if (b13.text == "") {
                b13.text = "X"
            } else {
                b13.text="X O"
            }
            winX()
        }
        }
    fun checkY(score:Int){
        var b11=findViewById<Button>(R.id.but11)
        var b12=findViewById<Button>(R.id.but12)
        var b13=findViewById<Button>(R.id.but13)
        var b14=findViewById<Button>(R.id.but14)
        var b15=findViewById<Button>(R.id.but15)
        var b21=findViewById<Button>(R.id.but21)
        var b22=findViewById<Button>(R.id.but22)
        var b23=findViewById<Button>(R.id.but23)
        var b24=findViewById<Button>(R.id.but24)
        var b25=findViewById<Button>(R.id.but25)
        var b31=findViewById<Button>(R.id.but31)
        var b32=findViewById<Button>(R.id.but32)
        var b33=findViewById<Button>(R.id.but33)
        var b34=findViewById<Button>(R.id.but34)
        var b35=findViewById<Button>(R.id.but35)
        var b41=findViewById<Button>(R.id.but41)
        var b42=findViewById<Button>(R.id.but42)
        var b43=findViewById<Button>(R.id.but43)
        var b44=findViewById<Button>(R.id.but44)
        var b45=findViewById<Button>(R.id.but45)
        var b51=findViewById<Button>(R.id.but51)
        var b52=findViewById<Button>(R.id.but52)
        var b53=findViewById<Button>(R.id.but53)
        var b54=findViewById<Button>(R.id.but54)
        var b55=findViewById<Button>(R.id.but55)
        if(initialY==33 && score==1){
            if(b33.text=="O")
            {
                b33.text=""
            }
            else{
                b33.text="X"
            }
            initialY=43
            if(b43.text==""){
                b43.text="O"
            }
            else{
                b33.text="X"
                initialX=33
                b43.text="O"
            }
        }
        else if(initialY==43){
            if(b43.text=="O")
            {
                b43.text=""
            }
            else{
                b43.text="X"
            }
            if(score==1){
                initialY=44
                if(b44.text==""){
                    b44.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b44.text="O"
                }
            }
            else if(score==2){
                initialY=34
                if(b34.text==""){
                    b34.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b34.text="O"
                }
            }
            else if(score==3){
                initialY=24
                if(b24.text==""){
                    b24.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b24.text="O"
                }
            }
            else{
                initialY=23
                if(b23.text==""){
                    b23.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b23.text="O"
                }
            }
        }
        else if(initialY==44){
            if(b44.text=="O")
            {
                b44.text=""
            }
            else{
                b44.text="X"
            }
            if(score==1){
                initialY=34
                if(b34.text==""){
                    b34.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b34.text="O"
                }
            }
            else if(score==2){
                initialY=24
                if(b24.text==""){
                    b24.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b24.text="O"
                }
            }
            else if(score==3){
                initialY=23
                if(b23.text==""){
                    b23.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b23.text="O"
                }
            }
            else{
                initialY=22
                if(b22.text==""){
                    b22.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b22.text="O"
                }
            }
        }
        else if(initialY==34){
            if(b34.text=="O")
            {
                b34.text=""
            }
            else{
                b34.text="X"
            }
            if(score==1){
                initialY=24
                if(b24.text==""){
                    b24.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b24.text="O"
                }
            }
            else if(score==2){
                initialY=23
                if(b23.text==""){
                    b23.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b23.text="O"
                }
            }
            else if(score==3){
                initialY=22
                if(b22.text==""){
                    b22.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b22.text="O"
                }
            }
            else{
                initialY=32
                if(b32.text==""){
                    b32.text="O"
                }
                else{
                    b32.text="X"
                    initialX=33
                    b32.text="O"
                }
            }
        }
        else if(initialY==24 && score==2){
            if(b24.text=="O")
            {
                b24.text=""
            }
            else{
                b24.text="X"
            }
            initialY=22
            if(b22.text==""){
                b22.text="O"
            }
            else{
                b33.text="X"
                initialX=33
                b22.text="O"
            }
        }
        else if(initialY==23){
            if(b23.text=="O")
            {
                b23.text=""
            }
            else{
                b23.text="X"
            }
            if(score==1){
                initialY=22
                if(b22.text==""){
                    b22.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b22.text="O"
                }
            }
            else if(score==2){
                initialY=32
                if(b32.text==""){
                    b32.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b32.text="O"
                }
            }
            else if(score==3){
                initialY=42
                if(b42.text==""){
                    b42.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b42.text="O"
                }
            }
            else{
                initialY=52
                if(b52.text==""){
                    b52.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b52.text="O"
                }
            }
        }
        else if(initialY==22){
            if(b22.text=="O")
            {
                b22.text=""
            }
            else{
                b22.text="X"
            }
            if(score==1){
                initialY=32
                if(b32.text==""){
                    b32.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b32.text="O"
                }
            }
            else if(score==2){
                initialY=42
                if(b42.text==""){
                    b42.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b42.text="O"
                }
            }
            else if(score==3){
                initialY=52
                if(b52.text==""){
                    b52.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b52.text="O"
                }
            }
            else{
                initialY=51
                if(b51.text==""){
                    b51.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b51.text="O"
                }
            }
        }
        else if(initialY==32){
            if(b32.text=="O")
            {
                b32.text=""
            }
            else{
                b32.text="X"
            }
            if(score==1){
                initialY=42
                if(b42.text==""){
                    b42.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b42.text="O"
                }
            }
            else if(score==2){
                initialY=52
                if(b52.text==""){
                    b52.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b52.text="O"
                }
            }
            else if(score==3){
                initialY=51
                if(b51.text==""){
                    b51.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b51.text="O"
                }
            }
            else{
                initialY=41
                if(b41.text==""){
                    b41.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b41.text="O"
                }
            }
        }
        else if(initialY==42 && score==2){
            if(b42.text=="O")
            {
                b42.text=""
            }
            else{
                b42.text="X"
            }
            initialY=51
            if(b51.text==""){
                b51.text="O"
            }
            else{
                b33.text="X"
                initialX=33
                b51.text="O"
            }
        }
        else if(initialY==52){
            if(b52.text=="O")
            {
                b52.text=""
            }
            else{
                b52.text="X"
            }
            if(score==1){
                initialY=51
                if(b51.text==""){
                    b51.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b51.text="O"
                }
            }
            else if(score==2){
                initialY=41
                if(b41.text==""){
                    b41.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b41.text="O"
                }
            }
            else if(score==3){
                initialY=31
                if(b31.text==""){
                    b31.text="O"
                }
                else{
                    b31.text="X O"
                }
            }
            else{
                initialY=21
                if(b21.text==""){
                    b21.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b21.text="O"
                }
            }
        }
        else if(initialY==51){
            if(b51.text=="O")
            {
                b51.text=""
            }
            else{
                b51.text="X"
            }
            if(score==1){
                initialY=41
                if(b41.text==""){
                    b41.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b41.text="O"
                }
            }
            else if(score==2){
                initialY=31
                if(b31.text==""){
                    b31.text="O"
                }
                else{
                    b31.text="X O"
                }
            }
            else if(score==3){
                initialY=21
                if(b21.text==""){
                    b21.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b21.text="O"
                }
            }
            else{
                initialY=11
                if(b11.text==""){
                    b11.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b11.text="O"
                }
            }
        }
        else if(initialY==41 && score==3){
            if(b41.text=="O")
            {
                b41.text=""
            }
            else{
                b41.text="X"
            }
            initialY=11
            if(b11.text==""){
                b11.text="O"
            }
            else{
                b33.text="X"
                initialX=33
                b11.text="O"
            }
        }
        else if(initialY==31){
            if(b31.text=="O")
            {
                b31.text=""
            }
            else{
                b31.text="X"
            }
            if(score==1){
                initialY=21
                if(b21.text==""){
                    b21.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b21.text="O"
                }
            }
            else if(score==2){
                initialY=11
                if(b11.text==""){
                    b11.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b11.text="O"
                }
            }
            else if(score==3){
                initialY=12
                if(b12.text==""){
                    b12.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b12.text="O"
                }
            }
            else{
                initialY=13
                if(b13.text==""){
                    b13.text="O"
                }
                else{
                    b13.text="X O"
                }
            }
        }
        else if(initialY==21){
            if(b21.text=="O")
            {
                b21.text=""
            }
            else{
                b21.text="X"
            }
            if(score==1){
                initialY=11
                if(b11.text==""){
                    b11.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b11.text="O"
                }
            }
            else if(score==2){
                initialY=12
                if(b12.text=="") {
                    b12.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b12.text="O"
                }
            }
            else if(score==3){
                initialY=13
                if(b13.text==""){
                    b13.text="O"
                }
                else{
                    b13.text="X O"
                }
            }
            else{
                initialY=14
                if(b14.text==""){
                    b14.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b14.text="o"
                }
            }
        }
        else if(initialY==11){
            if(b11.text=="O")
            {
                b11.text=""
            }
            else{
                b11.text="X"
            }
            if(score==1){
                initialY=12
                if(b12.text==""){
                    b12.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b12.text="O"
                }
            }
            else if(score==2){
                initialY=13
                if(b13.text==""){
                    b13.text="O"
                }
                else{
                    b13.text="X O"
                }
            }
            else if(score==3){
                initialY=14
                if(b14.text==""){
                    b14.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b14.text="O"
                }
            }
            else{
                initialY=15
                if(b15.text==""){
                    b15.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b15.text="O"
                }
            }
        }
        else if(initialY==12 && score==1) {
            if(b12.text=="O")
            {
                b12.text=""
            }
            else {
                b12.text = "X"
            }
            initialY =13
            if (b13.text == "") {
                b13.text = "O"
            } else {
                b13.text = "X O"
            }
        }
        else if(initialY==13){
            if(b13.text=="O")
            {
                b13.text=""
            }
            else{
                b13.text="X"
            }
            if(score==1){
                initialY=14
                if(b14.text==""){
                    b14.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b14.text="O"
                }
            }
            else if(score==2){
                initialY=15
                if(b15.text==""){
                    b15.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b15.text="O"
                }
            }
            else if(score==3){
                initialY=25
                if(b25.text==""){
                    b25.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b25.text="O"
                }
            }
            else{
                initialY=35
                if(b35.text==""){
                    b35.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b35.text="O"
                }
            }
        }
        else if(initialY==14){
            if(b14.text=="O")
            {
                b14.text=""
            }
            else{
                b14.text="X"
            }
            if(score==1){
                initialY=15
                if(b15.text==""){
                    b15.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b15.text="O"
                }
            }
            else if(score==2){
                initialY=25
                if(b25.text==""){
                    b25.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b25.text="O"
                }
            }
            else if(score==3){
                initialY=35
                if(b35.text==""){
                    b35.text="O"
                }
                else{
                    b35.text="X O"
                }
            }
            else{
                initialY=45
                if(b45.text==""){
                    b45.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b45.text="O"
                }
            }
        }
        else if(initialY==15){
            if(b15.text=="O")
            {
                b15.text=""
            }
            else{
                b15.text="X"
            }
            if(score==1){
                initialY=25
                if(b25.text==""){
                    b25.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b25.text="O"
                }
            }
            else if(score==2){
                initialY=35
                if(b35.text==""){
                    b35.text="O"
                }
                else{
                    b35.text="X O"
                }
            }
            else if(score==3){
                initialY=45
                if(b45.text==""){
                    b45.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b45.text="O"
                }
            }
            else{
                initialY=55
                if(b55.text==""){
                    b55.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b55.text="O"
                }
            }
        }
        else if(initialY==25 && score==3) {
            if(b25.text=="O")
            {
                b25.text=""
            }
            else{
                b25.text="X"
            }
            initialY = 55
            if (b55.text == "") {
                b55.text = "O"
            } else {
                b33.text="X"
                initialX=33
                b55.text="O"
            }
        }
        else if(initialY==35){
            if(b35.text=="O")
            {
                b35.text=""
            }
            else{
                b35.text="X"
            }
            if(score==1){
                initialY=45
                if(b45.text==""){
                    b45.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b45.text="O"
                }
            }
            else if(score==2){
                initialY=55
                if(b55.text==""){
                    b55.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b55.text="O"
                }
            }
            else if(score==3){
                initialY=54
                if(b54.text==""){
                    b54.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b54.text="O"
                }
            }
            else{
                initialY=53
                if(b53.text==""){
                    b53.text="O"
                }
                else{
                    b53.text="X O"
                }
                winY()
            }
        }
        else if(initialY==45){
            if(b45.text=="O")
            {
                b45.text=""
            }
            else{
                b45.text="X"
            }
            if(score==1){
                initialY=55
                if(b55.text==""){
                    b55.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b55.text="O"
                }
            }
            else if(score==2){
                initialY=54
                if(b54.text==""){
                    b54.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b54.text="O"
                }
            }
            else if(score==3){
                initialY=53
                if(b53.text==""){
                    b53.text="O"
                }
                else{
                    b53.text="X O"
                }
                winY()
            }
        }
        else if(initialY==55){
            if(b55.text=="O")
            {
                b55.text=""
            }
            else{
                b55.text="X"
            }
            if(score==1){
                initialY=54
                if(b54.text==""){
                    b54.text="O"
                }
                else{
                    b33.text="X"
                    initialX=33
                    b54.text="O"
                }
            }
            else if(score==2){
                initialY=53
                if(b53.text==""){
                    b53.text="O"
                }
                else{
                    b53.text="X O"
                }
                winY()
            }

        }
        else if(initialY==54 && score==1) {
            if(b54.text=="O")
            {
                b54.text=""
            }
            else{
                b54.text="X"
            }
            initialY = 53
            if (b53.text == "") {
                b53.text = "O"
            } else {
                b53.text="X O"
            }
            winY()
        }
    }
    private fun person1(view:View){
        if(ch1==true) {
            var score: Int = (1..4).random()
            var p1: TextView = findViewById(R.id.p1)
            p1.text = score.toString()
            checkX(score)
            ch2=true
            ch1=false
        }
    }
    private fun person2(view:View) {
        if (ch2 == true) {
            var score: Int = (1..4).random()
            var p2: TextView = findViewById(R.id.p2)
            p2.text = score.toString()
            checkY(score)
            ch2=false
            ch1=true
        }
    }
}