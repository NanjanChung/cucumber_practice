
package hellocucumber.stepdef;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BoardStep
{
    private List<List<String>> board;

    @Given("^a board like this:$")
    public void a_board_like_this (DataTable table)
        throws Exception
    {

        this.board = new ArrayList<List<String>>();

        for (List<String> row : table.raw()) {
            this.board.add(new ArrayList<String>(row));
        }
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @When("^player x plays in row (\\d+), column (\\d+)$")
    public void player_x_plays_in_row_column (int row, int column)
        throws Exception
    {
        board.get(row).set(column, "x");
    }

    @Then("^the board should look like this:$")
    public void the_board_should_look_like_this (DataTable expectedTable)
        throws Exception
    {
        expectedTable.diff(board);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

}