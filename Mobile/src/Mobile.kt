class Mobile {

    var brand:String =""
    var model:String =""
    var mpr:Float = 0f
    var discount:Float = 0f

    fun setMobile(){
        println("Enter the phone's brand:")
        this.brand=readLine().toString()
        println("Enter the phone's model:")
        this.model=readLine().toString()
        println("Enter the phone price:")
        this.mpr=readLine()!!.toFloat()
        println("Enter the discount offered:")
        this.discount=readLine()!!.toFloat()
    }

    fun getActuelPrice(){
        setMobile()
        var finalprice:Float = (this.mpr*this.discount)/100
        printDetail()
        println("The price after discount is $finalprice")
    }

    fun printDetail(){
        println("Phone brand: ${this.brand}")
        println("Phone model: ${this.model}")
        println("Phone mpr: ${this.mpr}")
        println("Phone discount: ${this.discount}")
    }

}