package Models

import java.io.Serializable

class Phone:Serializable {
    var type:Int? = 0
    var name:String? = null
    var info:String? = null

    constructor(type: Int?, name: String?, info: String?) {
        this.type = type
        this.name = name
        this.info = info
    }

    constructor()

}