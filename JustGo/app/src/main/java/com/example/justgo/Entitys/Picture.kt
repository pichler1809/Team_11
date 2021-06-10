package com.example.justgo.Entitys

import android.net.Uri
import java.io.Serializable

class Picture(var uri: String,var type: PictureVideoType):Serializable {
    var uri_:String = uri
    var type_:PictureVideoType = type

}

