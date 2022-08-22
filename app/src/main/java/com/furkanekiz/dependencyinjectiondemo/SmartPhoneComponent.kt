package com.furkanekiz.dependencyinjectiondemo

import dagger.Component

@Component
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}