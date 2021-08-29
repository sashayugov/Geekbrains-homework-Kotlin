package com.example.myapplication

object Example {
    var runners: List<Runner> = listOf(
        Runner("Sasha", 5.0),
        Runner(),
        Runner(pace = 5.0),
        Runner("Vlad")
    )

    var newCopy = runners[0].copy()
}