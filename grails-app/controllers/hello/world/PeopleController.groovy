package hello.world

class PeopleController {

    static layout = 'main'

    /**
     * List all people
     */
    def index() {
        [people: Person.list()]
    }

    /**
     * Show a person using the id received from the index
     */
    def show() {
        [person: Person.get(params.id)]
    }

    /**
     * First step for creating a new person. Simply redirects to a form
     */
    def create() {
        /* no-op. Auto-displays the corresponding view */
    }

    /**
     * Create the person and redirect to the index
     */
    def save() {
        def p = new Person(params)
        p.save(flush: true)
        [people: Person.list()]
        redirect(action: 'index')
    }

    /**
     * First step for editing an existing person whose id is provided by the link in index
     */
    def edit() {
        [person: Person.get(params.id)]
    }

    /**
     * Update the person from the parameters received from the editPerson form and redirect to index
     */
    def update() {
        def p = Person.get(params.id)
        p.name = params.name
        p.surname = params.surname
        p.save(flush: true)
        [people: Person.list()]
        redirect(action: 'index')
    }

    /**
     * Remove the person using the id from the index and redirect back to it
     * @return
     */
    def delete() {
        def p = Person.get(params.id)
        p.delete(flush: true)
        redirect(action: 'index')
    }
}
