
package com.example.mycleanapp.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mycleanapp.presentation.Interactors

open class MajesticViewModel(application: Application, protected val interactors: Interactors) :
    AndroidViewModel(application) {

  protected val application: MajesticReaderApplication = getApplication()

}
