# Getting Started
* Create project  https://start.spring.io/
  * Project : Maven
  * Language : Java
  * Spring Boot : 3.3.4
  * Packaging : Jar
  * Java : 23
  * Dependencies
    * MySQL Driver
    * Spring Data JPA
    * Spring Web

* Setting database : resources → application.properties
  * spring.datasource.url=jdbc:mysql://address:port/(database_name)
  * spring.datasource.username=root
  * spring.datasource.password=
  * spring.jpa.hibernate.ddl-auto=update

#### Checkpoint : Run application, if application does not show error that mean application can connect the database

* Create Entity Class
  * Create entity package
  * Create entity class
    * Add @Entity
    * Add @Table(name = 'order_table') above class (Warning : Cannot create table name "order")
    * Add class property
      * Id, book_id, member_id and due_date
    * Add default Constructor & Constructor with field
    * Add Getter & Setter
* Create Repository Class
  * Create repository package
  * Use JpaRepository instead
* Create Service & ServiceAction
  * Create services package
  * Order save(Order order);
  * List<Order> findAll();
  * Order findById(Integer id);
  * void deleteById(Integer id);
* Create RestController
  * Create controllers package
  * addOrder
  * getAllOrder
  * getOrder
  * deleteOrder
  * updateOrder