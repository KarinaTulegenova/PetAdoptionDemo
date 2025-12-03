Final Project

Authors: Karina Tulegenova & Zhanel Samatova

Group: SE-2419

Topic: Pet Adoption

Introduction
This report presents the implementation of a Pet Adoption System that demonstrates the practical application of 6 design patterns in Java with Spring Boot backend and modern web frontend. The system manages pet adoption processes through different channels while maintaining flexibility, extensibility, and clean code architecture.

1.1 Project Scope

The Pet Adoption System is a full-stack web application that:

Manages adoption of cats, dogs, and rabbits with breed-specific characteristics
Supports online and offline adoption strategies
Provides real-time notifications for adoption events
Offers currency-to-food conversion for pet care planning
Features a modern, responsive web interface
1.2 Technologies Used

Backend:

Java 17
Spring Boot
Maven
Frontend:

HTML5, CSS3, JavaScript
Bootstrap 5.3.3
Project Goals and Concept
2.1 Primary Goals

Demonstrate practical application of 6 design patterns in a real-world scenario
Create a maintainable and extensible pet adoption management system
Implement loose coupling between components
Provide multiple adoption strategies (online/offline)
Enable real-time event notifications
2.2 System Features

Pet Management:

9 pets available: 3 cats, 3 dogs, 3 rabbits
6 breeds: British Shorthair, Siamese, German Shepherd, Golden Retriever, Holland Lop, Netherland Dwarf
Each pet with detailed information (age, gender, weight, color, health status)
Adoption Process:

Two adoption methods: Online (courier delivery within 3 days) and Offline (shelter visit)
Email validation for online adoption
Address validation for offline adoption
Unique request ID generation
Automatic notifications
Additional Features:

Currency converter (USD, EUR, KZT, RUB to food quantity)
Search and filter by species
Sort by name or age
Dark/Light theme support
Notification log with Observer pattern demonstration
Design Patterns Implementation
3.1 Facade Pattern

Purpose: Provides a unified interface to the complex subsystem of pet adoption.

3.2 Factory Pattern

Purpose: Creates adoption kits with pets and accessories without exposing creation logic.

3.3 Decorator Pattern

Purpose: Dynamically adds breed-specific characteristics to pets.

3.4 Strategy Pattern

Purpose: Defines different adoption algorithms (online/offline) that can be selected at runtime.

3.5 Observer Pattern

Purpose: Notifies interested parties about adoption events in real-time.

3.6 Adapter Pattern

Purpose: Converts money amounts to food quantities for different currencies.

System Architecture 4.1 Project Structure

Conclusion The project presents a unified system designed to organize and support the pet-adoption process. Its purpose is to create a clear, convenient, and accessible platform where information about animals can be managed and viewed in one place. By providing tools for adding, updating, and adopting pets, the system helps streamline interactions between shelters and potential adopters, making the transition of animals into new homes more efficient and structured.

References

Facade: https://en.wikipedia.org/wiki/Facade_pattern

Adapter: https://en.wikipedia.org/wiki/Adapter_pattern

Strategy: https://en.wikipedia.org/wiki/Strategy_pattern

Observer: https://en.wikipedia.org/wiki/Observer_pattern

Decorator: https://en.wikipedia.org/wiki/Decorator_pattern

7.Link on Github: https://github.com/KarinaTulegenova/SDP_PetAdoption_System
