package com.example.taskjira.data.models

import kotlin.random.Random

@OptIn(ExperimentalStdlibApi::class)
fun taskModelFabric(): Task {
    val dummyProject = Project("DummyProject")
    return Task(
        id = 0,
        icon = TaskIcon.Default(),
        project = dummyProject,
        name = nameFabric(),
        deadline = TaskDate(),
        status = listOf(TaskStatus.InWork(), TaskStatus.Pause(), TaskStatus.Ready()).random(),
        priority = TaskPriority.values().random(),
        childTasks = buildList { repeat(Random.nextInt(0, 2)) { taskModelFabric() } },
        parentTasks = buildList { repeat(Random.nextInt(0, 1)) { taskModelFabric() } }
    )
}

fun nameFabric(): String {
    val words = "Служебная записка\n" +
            "В связи с производственной необходимостью перемещения" +
            " и посещения объектов компании в рамках командировки в" +
            " Кемерово 09.08.22 по 12.08.22 мною были произведены" +
            " следующие транспортные расходы".split(" ")
    return buildString { repeat(Random.nextInt(1,10)) { words.random() + " "} }
}



