// // Function to add a new task
// function addTask() {
//     const taskInput = document.getElementById("taskInput");
//     const taskText = taskInput.value.trim();
//     if (taskText === "") return;
//
//     const taskList = document.getElementById("taskList");
//     const taskItem = document.createElement("li");
//     taskItem.className = "taskItem";
//     taskItem.innerHTML = `
//         <input type="checkbox">
//         <span>${taskText}</span>
//         <button onclick="removeTask(this)">Remove</button>
//     `;
//
//     taskList.appendChild(taskItem);
//     taskInput.value = "";
// }
//
// // Function to remove a task
// function removeTask(button) {
//     const taskList = document.getElementById("taskList");
//     const taskItem = button.parentElement;
//     taskList.removeChild(taskItem);
// }
//
// // Event listener for adding a task
// document.getElementById("taskInput").addEventListener("keydown", function (event) {
//     if (event.key === "Enter") {
//         addTask();
//     }
// });
