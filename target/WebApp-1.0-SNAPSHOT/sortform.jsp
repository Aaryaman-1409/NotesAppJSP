<div style="padding-right:2vh">
    <form method="post" action="/sort.html">
        <div class="form-row align-items-end justify-content-end">
            <div class="col-auto">
                <label class="text-light" for="sortby">Sort By</label>
                <select class="form-control" id="sortby" name="sortby">
                    <option>title</option>
                    <option>content</option>
                </select>
            </div>
            <div class="col-auto">
                <label class="text-light" for="inorder">In Order</label>
                <select class="form-control" id="inorder" name="order">
                    <option>ascending</option>
                    <option>descending</option>
                </select>
            </div>
            <div class="col-auto">
                <div style="transform: translateY(15%)">
                    <button type="submit" class="btn btn-primary mb-2">Submit</button>
                </div>
            </div>
        </div>
    </form>
</div>