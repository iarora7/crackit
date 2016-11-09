package main.java.trees;

//Java program to check if binary tree is subtree of another binary tree 
/*
 * 		T:			a				 
				  /   \
				 b     d
				/       \
			   c       	 e
			   
		S:	  		a				 
				  /   \
				 b     d
				/       
			   c       	 
			
 */
class CharNode {
	char data;
	CharNode left, right;

	CharNode(char item) {
		data = item;
		left = right = null;
	}
}

class Passing {

	int i;
	int m = 0;
	int n = 0;
}

public class SubtreeGeeks {

	static CharNode root;
	Passing p = new Passing();

	String strstr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return null;
		}
		int hLength = haystack.length();
		int nLength = needle.length();
		if (hLength < nLength) {
			return null;
		}
		if (nLength == 0) {
			return haystack;
		}
		for (int i = 0; i <= hLength - nLength; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int j = 0;
				for (; j < nLength; j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						break;
					}
				}
				if (j == nLength) {
					return haystack.substring(i);
				}
			}
		}
		return null;
	}

	// A utility function to store inorder traversal of tree rooted
	// with root in an array arr[]. Note that i is passed as reference
	void storeInorder(CharNode node, char arr[], Passing i) {
		if (node == null) {
			arr[i.i++] = '$';
			return;
		}
		storeInorder(node.left, arr, i);
		arr[i.i++] = node.data;
		storeInorder(node.right, arr, i);
	}

	// A utility function to store preorder traversal of tree rooted
	// with root in an array arr[]. Note that i is passed as reference
	void storePreOrder(CharNode node, char arr[], Passing i) {
		if (node == null) {
			arr[i.i++] = '$';
			return;
		}
		arr[i.i++] = node.data;
		storePreOrder(node.left, arr, i);
		storePreOrder(node.right, arr, i);
	}

	/* This function returns true if S is a subtree of T, otherwise false */
	boolean isSubtree(CharNode T, CharNode S) {
		/* base cases */
		if (S == null) {
			return true;
		}
		if (T == null) {
			return false;
		}

		// Store Inorder traversals of T and S in inT[0..m-1]
		// and inS[0..n-1] respectively
		char inT[] = new char[100];
		String op1 = String.valueOf(inT);
		char inS[] = new char[100];
		String op2 = String.valueOf(inS);
		storeInorder(T, inT, p);
		storeInorder(S, inS, p);
		inT[p.m] = '\0';
		inS[p.m] = '\0';

		// If inS[] is not a substring of preS[], return false
		if (strstr(op1, op2) != null) {
			return false;
		}

		// Store Preorder traversals of T and S in inT[0..m-1]
		// and inS[0..n-1] respectively
		p.m = 0;
		p.n = 0;
		char preT[] = new char[100];
		char preS[] = new char[100];
		String op3 = String.valueOf(preT);
		String op4 = String.valueOf(preS);
		storePreOrder(T, preT, p);
		storePreOrder(S, preS, p);
		preT[p.m] = '\0';
		preS[p.n] = '\0';

		// If inS[] is not a substring of preS[], return false
		// Else return true
		return (strstr(op3, op4) != null);
	}

	// Driver program to test above functions
	public static void main(String args[]) {
		SubtreeGeeks tree = new SubtreeGeeks();
		CharNode T = new CharNode('a');
		T.left = new CharNode('b');
		T.right = new CharNode('d');
		T.left.left = new CharNode('c');
		T.right.right = new CharNode('e');

		CharNode S = new CharNode('a');
		S.left = new CharNode('b');
		S.right = new CharNode('d');
		S.left.left = new CharNode('c');

		if (tree.isSubtree(T, S)) {
			System.out.println("Yes , S is a subtree of T");
		} else {
			System.out.println("No, S is not a subtree of T");
		}
	}
}

