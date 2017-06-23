package com.example.supersoft.pos_app

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


public class LoginActivity : AppCompatActivity() {

    var RegexPattern = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")
    var URL= "http://127.0.0.1"
   // private var button: Button? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //button = bind(R.id.Loginbutton); //findViewById(R.id.LoginButton) as Button

        Loginbutton.setOnClickListener(View.OnClickListener
        {

            if(ValidateInput(edtUserName,edtPass)) {
                    Authenticate(edtUserName,edtPass)
            }
            //edtUserName.text
//            if(ValidateInput(edtUserName, edtPass) {
//                var T: Toast = Toast.makeText(this, "Please enter the details", Toast.LENGTH_SHORT)
//                T.show()
//            }
            //else if)
        })
    }

    private fun Authenticate(edtUserName: EditText?, edtPass: EditText?) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun ValidateInput(edttxt: EditText, edtpass: EditText):Boolean
    {
        if(edttxt.text.isNullOrBlank() and edtpass.text.isNullOrBlank())
        {
            var T: Toast = Toast.makeText(this, "Please enter the details", Toast.LENGTH_SHORT)
            T.show()
            return false
        }
        else
        {
            return true
        }
      //else if(edtpass.text.count()<6 or edtpass.text.{}
    }



    fun <T : View> Activity.bind(@IdRes res: Int):
            T { //@Supress("UNCHECKED_CAST")
        return findViewById(res) as T
    }

}
//annotation class Supress(val value: String)

