package com.nip.testapi

import android.content.Context
import android.widget.Toast

/**
 * @author chenkai
 * @date 2023/12/9.
 * description：
 */
class TestApi {

    fun getTestHello(context: Context){
        Toast.makeText(context,"first api",Toast.LENGTH_SHORT).show()

    }
}