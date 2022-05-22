fun main(){

    var cnt:String="Yes"
    fun doYouWantToContinue(){
        println("Do you want to continue ? (Yes/No)")
        cnt = readLine().toString()
        if (cnt == "No"){
            System.exit(0)
        }
    }


    while (cnt == "Yes"){
        var Phone = Mobile()
        Phone.getActuelPrice()
        doYouWantToContinue()
    }


}