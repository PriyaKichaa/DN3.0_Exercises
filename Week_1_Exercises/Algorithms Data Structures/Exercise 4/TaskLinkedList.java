class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task.getTaskId() + " - " + current.task.getTaskName() + " (" + current.task.getStatus() + ")");
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        Node current = head;
        Node prev = null;

            if (current != null && current.task.getTaskId().equals(taskId)) {
            head = current.next; // Changed head
            return;
        }

        while (current != null && !current.task.getTaskId().equals(taskId)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
            return;
        }
        prev.next = current.next;
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T001", "Design UI", "In Progress"));
        taskList.addTask(new Task("T002", "Implement Backend", "Not Started"));
        taskList.addTask(new Task("T003", "Testing", "Not Started"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearch for Task T002:");
        Task task = taskList.searchTask("T002");
        if (task != null) {
            System.out.println(task.getTaskId() + " - " + task.getTaskName() + " (" + task.getStatus() + ")");
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting Task T002:");
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}