
package com.example.mycleanapp.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mycleanapp.framework.ReaderApplication
import com.example.mycleanapp.presentation.Interactors

open class BaseViewModel(application: Application, protected val interactors: Interactors) :
    AndroidViewModel(application) {
  protected val application: ReaderApplication = getApplication()
}
