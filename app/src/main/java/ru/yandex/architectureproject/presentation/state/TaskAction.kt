package ru.yandex.architectureproject.presentation.state

sealed class TaskAction {
    data object LoadTasks : TaskAction()
    data class AddTask(val task: String) : TaskAction()
    data class ChangeTaskStatus(val taskId: Int, val isDone: Boolean) : TaskAction()
    data class DeleteTask(val taskId: Int) : TaskAction()
}
