package com.example.mycleanapp.framework.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mycleanapp.framework.utils.Interactors
import com.example.mycleanapp.presentation.viewmodel.BaseViewModel

/*
*   responsible to instantiate ViewModels
*
* */
object ViewModelFactory : ViewModelProvider.Factory {

    lateinit var application: Application
    lateinit var dependencies: Interactors
    fun inject(application: Application, dependencies: Interactors) {
        ViewModelFactory.application = application
        ViewModelFactory.dependencies = dependencies
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (BaseViewModel::class.java.isAssignableFrom(modelClass)) {
            return modelClass.getConstructor(Application::class.java, Interactors::class.java)
                .newInstance(
                    application,
                    dependencies
                )
        } else {
            throw IllegalStateException("ViewModel must extend BaseViewModel")
        }
    }

}
