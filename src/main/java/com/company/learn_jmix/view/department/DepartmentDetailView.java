package com.company.learn_jmix.view.department;

import com.company.learn_jmix.entity.Department;
import com.company.learn_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "departments/:id", layout = MainView.class)
@ViewController(id = "Department.detail")
@ViewDescriptor(path = "department-detail-view.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentDetailView extends StandardDetailView<Department> {
}